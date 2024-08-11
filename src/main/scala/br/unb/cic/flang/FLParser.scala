package br.unb.cic.flang

import scala.util.parsing.combinator._

class FLParser extends RegexParsers {

  def expr: Parser[Expr] = term ~ rep("+" ~ term) ^^ { 
    case t ~ Nil => t 
    case t ~ ops => ops.foldLeft(t) { case (left, "+" ~ right) => Add(left, right) }
  }

  def term: Parser[Expr] = factor ~ rep("*" ~ factor) ^^ {
    case f ~ Nil => f
    case f ~ ops => ops.foldLeft(f) { case (left, "*" ~ right) => Mul(left, right) }
  }

  def factor: Parser[Expr] = const | "if" ~ expr ~ "then" ~ expr ~ "else" ~ expr ^^ { 
      case _ ~ cond ~ _ ~ thenExpr ~ _ ~ elseExpr => IfThenElse(cond, thenExpr, elseExpr) 
    }
  
  def const : Parser[Expr] = """0|[1-9]\d*""".r ^^ { n => CInt(n.toInt) }
}






/*
class FLParser extends RegexParsers {

  def expr: Parser[Expr] = ( const )
  def const: Parser[Expr] = """(0|[1-9]\d*)""".r ^^ { case n => CInt(n.toInt) }

}*/