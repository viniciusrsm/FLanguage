package br.unb.cic.flang

import cats.data.State
import org.scalatest._

import Interpreter._
import flatspec._
import matchers._
import MonadState._
import Declarations._

class MonadTest extends AnyFlatSpec with should.Matchers {

  val inc = FDeclaration("inc", "x", Add(Id("x"), CInt(1)))

  val declarations = List(inc)

  val initialState: S = List()

  "pure" should "run and return 10" in {
    val step1 = pure(10)
    val (_, res) = step1.run(initialState).value

    res should be(10)
  }

  "put" should "run and return List((1, test))" in {
    val step1 = set(List((1, "test")))
    val (res, _) = step1.run(initialState).value

    res should be(List((1, "test")))
  }

  "get" should "List((5,test))" in {
    val step1 = get
    val state: S = List((5, "test"))
    val (_, res) = step1.run(state).value

    res should be(List((5,"test")))
  }

  "declareVar" should "combine two different states" in {
    val test1 = declareVar("test_1", 10, initialState)
    val res = declareVar("test_2", 20, test1)

    res should be(List((20, "test_2"), (10, "test_1")))
  }

  "lookupVar" should "find state by name" in {
    val test1 = declareVar("test_1", 10, initialState)
    val test2 = declareVar("test_2", 20, test1)

    val res = lookupVar("test_2", test2)

    res should be(20)
  }
}
