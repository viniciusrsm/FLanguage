package br.unb.cic.flang

import scala.util.parsing.combinator._

class FLParser extends RegexParsers {

  def expr : Parser[Expr] = (term | ifThenElse | fdef)

  def ifThenElse: Parser[Expr] = "?" ~ comparison ~ "then" ~ term ~ "else" ~ term ^^ { case _ ~ c ~ _ ~ e1 ~ _ ~ e2 => IfThenElse(c, e1, e2) }

// Comparison Macthes
    
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

// --------------------------------------------------------------------

  def fdef : Parser[Expr] = "@" ~ """\w+""".r ~ "(" ~ """\w+""".r ~ ")" ~ "=>" ~ "{" ~ term ~ "}" ^^ {
      case _ ~ funcName ~ _ ~ argu ~ _ ~ _ ~ _ ~ body ~ _ => FDeclaration(funcName, argu, body)
  }

  def term : Parser[Expr] = factor ~ rep("+" ~ factor) ^^ { 
    case t ~ Nil => t 
    case t ~ ops => ops.foldLeft(t) { case (left, "+" ~ right) => Add(left, right) }
  }

  def factor : Parser[Expr] = value ~ rep("*" ~ value) ^^ {
    case f ~ Nil => f
    case f ~ ops => ops.foldLeft(f) { case (left, "*" ~ right) => Mul(left, right) }
  }

  def value : Parser[Expr] = (const | app | id )

  def app : Parser[Expr] = """\w+""".r ~ "(" ~ term ~ ")" ^^ {
    case funcName ~ _ ~ expsub ~ _ => App(funcName, expsub)
  }
  def const : Parser[Expr] = """0|[1-9]\d*""".r ^^ { n => CInt(n.toInt)}

  def id : Parser[Expr] = """\w+""".r ^^ { name => Id(name)}

}





