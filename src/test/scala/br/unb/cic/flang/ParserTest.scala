package br.unb.cic.flang

import org.scalatest._
import flatspec._
import matchers._
import Interpreter._
import Declarations._
import MonadStateError._


class FLParserSpec extends AnyFlatSpec with should.Matchers {

  val parser = new FLParser

  "The FLParser" should "parse valid integer constants" in {
    parser.parse(parser.expr, "0") should be(CInt(0))
    parser.parse(parser.expr, "42") should be(CInt(42))
    parser.parse(parser.expr, "12345") should be(CInt(12345))
  }
}