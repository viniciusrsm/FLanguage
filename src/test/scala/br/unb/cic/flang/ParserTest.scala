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
    parser.parse(parser.expr, "10 * 2 + 10") should matchPattern { case parser.Success(Add(Mul(CInt(10), CInt(2)), CInt(10)), _) => }
    parser.parse(parser.expr, "if 1 then 2 else 10") should matchPattern { case parser.Success(IfThenElse(CInt(1), CInt(2), CInt(10)), _) => }
    
  }

}