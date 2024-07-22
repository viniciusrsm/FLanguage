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
    val (_, res) = runState(eval(c5, declarations))(initialState).fold(l => (None, l), r => r._2.fold(rl => (r._1, rl), rr => (r._1, rr)))
    val eIf = CBool(res == 5)
    val eThen = Add(CInt(5), CInt(10))
    val eElse = Mul(CInt(5), CInt(10))
    val exp = IfThenElse(eIf, eThen, eElse)
    val (_, res2) = runState(eval(exp, declarations))(initialState).fold(l => (None, l), r => r._2.fold(rl => (r._1, rl), rr => (r._1, rr)))
    
    res2 should be (15)
  }

  "if CInt(5) = 6" should "return 50" in {
    val c5 = CInt(5)
    val (_, res) = runState(eval(c5, declarations))(initialState).fold(l => (None, l), r => r._2.fold(rl => (r._1, rl), rr => (r._1, rr)))
    val eIf = CBool(res == 6)
    val eThen = Add(CInt(5), CInt(10))
    val eElse = Mul(CInt(5), CInt(10))
    val exp = IfThenElse(eIf, eThen, eElse)
    val (_, res2) = runState(eval(exp, declarations))(initialState).fold(l => (None, l), r => r._2.fold(rl => (r._1, rl), rr => (r._1, rr)))
    
    res2 should be (50)
  }

  "if true" should "return true" in {
    val eIf = CBool(true)
    val eThen = CBool(true)
    val eElse = CBool(false)
    val exp = IfThenElse(eIf, eThen, eElse)
    val (_, res) = runState(eval(exp, declarations))(initialState).fold(l => (None, l), r => r._2.fold(rl => (r._1, rl), rr => (r._1, rr)))

    println(res)
    
    res shouldBe (true)
  }

  "if false" should "return false" in {
    val eIf = CBool(false)
    val eThen = CBool(true)
    val eElse = CBool(false)
    val exp = IfThenElse(eIf, eThen, eElse)
    val (_, res) = runState(eval(exp, declarations))(initialState).fold(l => (None, l), r => r._2.fold(rl => (r._1, rl), rr => (r._1, rr)))
    
    res shouldBe (false)
  }
}
