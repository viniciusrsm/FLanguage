package br.unb.cic.flang


import cats.data.State
import cats.data.StateT
import org.scalatest._

import flatspec._
import matchers._
import Interpreter._
import MonadStateError._
import MonadStateError.eh.raiseError
import Declarations._


class MonadTest extends AnyFlatSpec with should.Matchers {

  val initialState: S = List()

  "set" should "run and return List((1, test))" in {
    val step1 = set(List((1, "test")))
    val (res, _) = step1.run(initialState).fold(l => (None, l), r => r)


    res should be(List((1, "test")))
  }

  "get" should "List((5,test))" in {
    val step1 = get
    val state: S = List((5, "test"))
    val (_, res) = step1.run(state).fold(l => (None, l), r => r)

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

    val look = lookupVar("test_2", test2)
    val (_, res) = look.run(test2).fold(l => (None, l), r => r)

    res should be(20)
  }

  "lookupVar with empty list" should "raise error 'Function is not declared'" in {

    val look = lookupVar("test_2", List())
    val (_, res) = look.run(List()).fold(l => (None, l), r => r)

    res should be("Function test_2 is not declared")
  }

  
}
