package br.unb.cic.flang

import org.scalatest._

import flatspec._
import matchers._
import Interpreter._
import Declarations._
import MonadStateError._

class IfThenElseTest extends AnyFlatSpec with should.Matchers {

  val inc = FDeclaration("inc", "x", Add(Id("x"), CInt(1)))

  val declarations = List(inc)

  val initialState: S = List()
  

  "if CInt(5) = 5" should "return 15" in {
    val c5 = CInt(5)
    val (_, res) = runState(eval(c5, declarations))(initialState).getOrElse((None, None))
    val eIf = CBool(res == Right(5))
    val eThen = Add(CInt(5), CInt(10))
    val eElse = Mul(CInt(5), CInt(10))
    val exp = IfThenElse(eIf, eThen, eElse)
    val (_, res2) = runState(eval(exp, declarations))(initialState).getOrElse((None, None))
    
    res2 should be (Right(15))
  }

  "if CInt(5) = 6" should "return 50" in {
    val c5 = CInt(5)
    val (_, res) = runState(eval(c5, declarations))(initialState).getOrElse((None, None))
    val eIf = CBool(res == Right(6))
    val eThen = Add(CInt(5), CInt(10))
    val eElse = Mul(CInt(5), CInt(10))
    val exp = IfThenElse(eIf, eThen, eElse)
    val (_, res2) = runState(eval(exp, declarations))(initialState).getOrElse((None, None))
    
    res2 should be (Right(50))
  }

  "if true" should "return true" in {
    val eIf = CBool(true)
    val eThen = CBool(true)
    val eElse = CBool(false)
    val exp = IfThenElse(eIf, eThen, eElse)
    val (_, res) = runState(eval(exp, declarations))(initialState).getOrElse((None, None))

    
    res should be (Left(false))
  }

  "if false" should "return false" in {
    val eIf = CBool(false)
    val eThen = CBool(true)
    val eElse = CBool(false)
    val exp = IfThenElse(eIf, eThen, eElse)
    val (_, res) = runState(eval(exp, declarations))(initialState).getOrElse((None, None))
    
    res should be (Left(false))
  }

}
