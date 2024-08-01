package br.unb.cic.flang

import br.unb.cic.flang.Interpreter._
import cats.Eval
import cats.data.IndexedStateT
import cats.data.State

package object MonadState {
    type S = List[(Integer, String)]

    type MState[A] = State[S, A]

    def pure[A](a: A): MState[A] = State.pure(a)

    def set(s: S): MState[Unit] = State.set(s)

    def get: MState[S] = State.get

    def declareVar(name: String, value: Integer, state: S): S =
        (value, name) :: state

    def lookupVar(name: String, state: S): Integer = state match {
        case List()                      => ???
        case (v, n) :: tail if n == name => v
        case _ :: tail                   => lookupVar(name, tail)
    }

}
