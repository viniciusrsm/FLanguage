package br.unb.cic.flang
import Interpreter._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import scala.util.parsing.combinator.RegexParsers


class FLParserSpec extends AnyFlatSpec with Matchers {

  val parser = new FLParser

  "The Parser" should "parse valid integer constants" in {
    parser.parse(parser.expr, "0") should matchPattern { case parser.Success(CInt(0), _) => }
    parser.parse(parser.expr, "42") should matchPattern { case parser.Success(CInt(42), _) => }
    parser.parse(parser.expr, "12345") should matchPattern { case parser.Success(CInt(12345), _) => }
  }
  "The Parser" should "Do arbitrary amounts of nested Aditions" in {
    parser.parse(parser.expr, "1 + 2") should matchPattern { case parser.Success(Add(CInt(1), CInt(2)), _) => }
    parser.parse(parser.expr, "1 + 2 + 3") should matchPattern { case parser.Success(Add(Add(CInt(1), CInt(2)), CInt(3)), _) => }
    parser.parse(parser.expr, "1 + 2 + 3 + 4") should matchPattern { case parser.Success(Add(Add(Add(CInt(1), CInt(2)), CInt(3)), CInt(4)), _) => }
  }

  "The Parser" should "Do arbitrary amounts o nested multiplications" in {
    parser.parse(parser.expr, "1 * 2") should matchPattern { case parser.Success(Mul(CInt(1), CInt(2)), _) => }
    parser.parse(parser.expr, "1 * 2 * 3") should matchPattern { case parser.Success(Mul(Mul(CInt(1), CInt(2)), CInt(3)), _) => }
    parser.parse(parser.expr, "1 * 2 * 3 * 4") should matchPattern { case parser.Success(Mul(Mul(Mul(CInt(1), CInt(2)), CInt(3)), CInt(4)), _) => }
  }

  "The Parser" should "Know Arithmetic precedence" in {
    parser.parse(parser.expr, "10 + 2 * 5") should matchPattern { case parser.Success(Add(CInt(10), Mul(CInt(2), CInt(5))), _) => }
    parser.parse(parser.expr, "10 * 2 + 5") should matchPattern { case parser.Success(Add(Mul(CInt(10), CInt(2)), CInt(5)), _) => }
  }

  "The Parser" should "Have Flow control (IfThenElse)" in {
    parser.parse(parser.expr, "? 1 == 2 then 2 + 3 else 0") should matchPattern { case parser.Success(IfThenElse(CBool(false), Add(CInt(2), CInt(3)), CInt(0)), _) => }
    parser.parse(parser.expr, "? 10 >= 10 then 5 else 2 * 3") should matchPattern { case parser.Success(IfThenElse(CBool(true), CInt(5), Mul(CInt(2), CInt(3))), _) => }
    parser.parse(parser.expr, "? 7 < 5 then 2 * 2 else 1 + 2") should matchPattern { case parser.Success(IfThenElse(CBool(false), Mul(CInt(2), CInt(2)), Add(CInt(1), CInt(2))), _) => }
  }

  "The FLParser" should "Define Functions" in {
    
    parser.parse(parser.expr, "@ inc(x) => {x + 1}") should matchPattern { case parser.Success(FDeclaration("inc", "x", Add(Id("x"), CInt(1))), _) => }
    parser.parse(parser.expr, "@ foo(y) => {y * y}") should matchPattern { case parser.Success(FDeclaration("foo", "y", Mul(Id("y"), Id("y"))), _) => }
    parser.parse(parser.expr, "@ bar(z) => {2 * z + 4}") should matchPattern { case parser.Success(FDeclaration("bar", "z", Add(Mul(CInt(2), Id("z")), CInt(4))), _) => }
  }

  "The FLParser" should "Make Function Aplications" in {
    parser.parse(parser.expr, "3 * inc(1)") should matchPattern { case parser.Success(Mul(CInt(3), App("inc", CInt(1))), _) => }
    parser.parse(parser.expr, "5 + foo(2 + 1) * 2") should matchPattern { case parser.Success(Add(CInt(5), Mul(App("foo", Add(CInt(2), CInt(1))), CInt(2))), _) => }
  }

}