package br.unb.cic.flang
import Interpreter._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.util.parsing.combinator.RegexParsers


class FLParserSpec extends AnyFlatSpec with Matchers {

  val parser = new FLParser

  "The FLParser" should "parse valid integer constants" in {
    parser.parse(parser.expr, "0") should matchPattern { case parser.Success(CInt(0), _) => }
    parser.parse(parser.expr, "42") should matchPattern { case parser.Success(CInt(42), _) => }
    parser.parse(parser.expr, "12345") should matchPattern { case parser.Success(CInt(12345), _) => }
  }

    "The FLParser" should "Give a pirueta" in {
    parser.parse(parser.expr, "if 10 == 10 then 10 else 20") should matchPattern { case parser.Success(IfThenElse(CBool(true), CInt(10), CInt(20)), _) => }
    parser.parse(parser.expr, "if 10 >= 10 then 10 else 20") should matchPattern { case parser.Success(IfThenElse(CBool(true), CInt(10), CInt(20)), _) => }
    parser.parse(parser.expr, "if 10 < 10 then 10 else 20") should matchPattern { case parser.Success(IfThenElse(CBool(false), CInt(10), CInt(20)), _) => }
    
  }

}