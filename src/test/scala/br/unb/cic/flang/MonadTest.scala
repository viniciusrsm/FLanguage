package br.unb.cic.flang


import cats.data.State
import org.scalatest._

import flatspec._
import matchers._
import Interpreter._
import MonadStateError._
import MonadStateError.eh.raiseError
import Declarations._
import cats.data.StateT


class MonadTest extends AnyFlatSpec with should.Matchers {

  val initialState: S = List()

  "set" should "run and return List((1, test))" in {
    val step1 = set(List((1, "test")))
    val (res, _) = runState(step1)(initialState).getOrElse((None, None))


    res should be(List((1, "test")))
  }

  "get" should "List((5,test))" in {
    val step1 = get
    val state: S = List((5, "test"))
    val (_, res) = runState(step1)(state).getOrElse((None, None))

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
    val (_, res) = runState(look)(test2).getOrElse((None, None))

    res should be(20)
  }

  "lookupVar" should "raise error on empty list" in {

    val look = lookupVar("test_2", List())
    val res = runState(look)(List()).getOrElse(None)

    res should be(None)
  }

  
}
