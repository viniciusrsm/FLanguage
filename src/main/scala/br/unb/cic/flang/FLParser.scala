package br.unb.cic.flang

import scala.util.parsing.combinator._

class FLParser extends RegexParsers {

  def expr : Parser[Expr] = (factor | ifThenElse | fdef)

  def ifThenElse: Parser[Expr] = "if" ~ comparison ~ "then" ~ expr ~ "else" ~ expr ^^ { case _ ~ c ~ _ ~ e1 ~ _ ~ e2 => IfThenElse(c, e1, e2) }

  def factor : Parser[Expr] = term ~ rep("+" ~ term) ^^ { 
    case t ~ Nil => t 
    case t ~ ops => ops.foldLeft(t) { case (left, "+" ~ right) => Add(left, right) }
  }

  def term: Parser[Expr] = const ~ rep("*" ~ const) ^^ {
    case f ~ Nil => f
    case f ~ ops => ops.foldLeft(f) { case (left, "*" ~ right) => Mul(left, right) }
  }
  
  def const : Parser[Expr] = """0|[1-9]\d*""".r ^^ { n => CInt(n.toInt)}

  def fdef : Parser[Expr] =  

/// EValuation Of Comparisons

  def comparison: Parser[Expr] = (equalTo | greaterOrEqualTo | lessThan) 

  def equalTo: Parser[Expr] = const ~ "==" ~ const ^^ {
    case CInt(e1) ~ _ ~ CInt(e2) => CBool(e1 == e2)
  }

  def greaterOrEqualTo: Parser[Expr] = const ~ ">=" ~ const ^^ {
    case CInt(e1) ~ _ ~ CInt(e2) => CBool(e1 >= e2)
  }

  def lessThan: Parser[Expr] = const ~ "<" ~ const ^^ {
    case CInt(e1) ~ _ ~ CInt(e2) => CBool(e1 < e2)
  }
}





