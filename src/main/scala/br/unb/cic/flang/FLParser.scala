package br.unb.cic.flang

import scala.util.parsing.combinator._

class FLParser extends RegexParsers {

  def expr: Parser[Expr] = ( const )
  def const: Parser[Expr] = """(0|[1-9]\d*)""".r ^^ { case n => CInt(n.toInt) }
}