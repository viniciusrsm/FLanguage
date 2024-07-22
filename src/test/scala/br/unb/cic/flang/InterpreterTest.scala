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
    val (_, res) = runState(eval(c5, declarations))(initialState).getOrElse((None, None))
    
    res should be (Right(5))
  }

  "eval Add(CInt(5), CInt(10)) " should "return an integer value 15." in {
    val c5  = CInt(5)
    val c10 = CInt(10)
    val add = Add(c5, c10)
    val (_, res) = runState(eval(add, declarations))(initialState).getOrElse((None, None))
    res should be (Right(15))
  }

  "eval Add(CInt(5), Add(CInt(5), CInt(10))) " should "return an integer value 20." in {
    val c5 = CInt(5)
    val c10 = CInt(10)
    val add = Add(c5, Add(c5, c10))
    val (_, res) = runState(eval(add, declarations))(initialState).getOrElse((None, None))
    res should be(Right(20))
  }

  "eval Mul(CInt(5), CInt(10))" should "return an integer value 50" in {
    val c5 = CInt(5)
    val c10 = CInt(10)
    val mul = Mul(c5, CInt(10))
    val (_, res2) = eval(mul, declarations).run(initialState).getOrElse(0)
    
    val (_, res) = runState(eval(mul, declarations))(initialState).getOrElse((None, None))
    res should be(Right(50))
  }

  "eval App(inc, 99) " should "return an integer value 100" in {
    val app = App("inc", CInt(99))
    val (_, res) = runState(eval(app, declarations))(initialState).getOrElse((None, None))


    res should be (Right(100))
  }

  "eval App with empty list" should "return Left (None)" in {
    val app = App("inc", CInt(99))
    val (_, res) = runState(eval(app, List()))(initialState).getOrElse((None, None))


    res should be (None)
  }

}
