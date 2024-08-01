package br.unb.cic.flang

import org.scalatest._

import flatspec._
import matchers._
import Interpreter._
import Declarations._
import MonadStateError._

class InterpreterTest extends AnyFlatSpec with should.Matchers {

  val inc = FDeclaration("inc", "x", Add(Id("x"), CInt(1)))

  val declarations = List(inc)

  val initialState: S = List()
  

  "eval CInt(5)" should "return an integer value 5." in {
    val c5 = CInt(5)
    val (_, res) = eval(c5, declarations).run(initialState).fold(l => (None, l), r => r)
    
    res should be (5)
  }

  "eval Add(CInt(5), CInt(10)) " should "return an integer value 15." in {
    val c5  = CInt(5)
    val c10 = CInt(10)
    val add = Add(c5, c10)
    val (_, res) = eval(add, declarations).run(initialState).fold(l => (None, l), r => r)
    res should be (15)
  }

  "eval Add(CInt(5), Add(CInt(5), CInt(10))) " should "return an integer value 20." in {
    val c5 = CInt(5)
    val c10 = CInt(10)
    val add = Add(c5, Add(c5, c10))
    val (_, res) = eval(add, declarations).run(initialState).fold(l => (None, l), r => r)
    res should be(20)
  }

  "eval Mul(CInt(5), CInt(10))" should "return an integer value 50" in {
    val c5 = CInt(5)
    val c10 = CInt(10)
    val mul = Mul(c5, CInt(10))
    val (_, res) = eval(mul, declarations).run(initialState).fold(l => (None, l), r => r)
    res should be(50)
  }

  "eval App(inc, 99) " should "return an integer value 100" in {
    val app = App("inc", CInt(99))
    val (_, res) = eval(app, declarations).run(initialState).fold(l => (None, l), r => r)

    res should be (100)
  }

  "eval App with empty declarations list" should "return 'Function inc is not declared'" in {
    val app = App("inc", CInt(99))
    val (_, res) = eval(app, List()).run(initialState).fold(l => (None, l), r => r)

    res should be ("Function inc is not declared")
  }

}
