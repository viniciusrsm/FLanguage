package br.unb.cic.flang

import cats.MonadError
import cats.data.StateT

import scala.reflect.ClassTag

package object MonadStateError {
    type MError[A] = Either[String, A]

    type S = List[(Integer, String)]

    type ErrorOrState[A] = StateT[MError, S, A]

    val eh = MonadError[ErrorOrState, String]

    def pure[A](a: A): ErrorOrState[A] = StateT.pure(a)

    def set(s: S): ErrorOrState[Unit] = StateT.set(s)

    def get: ErrorOrState[S] = StateT.get

    def declareVar(name: String, value: Integer, state: S): S =
        (value, name) :: state

    def lookupVar(name: String, state: S): ErrorOrState[Integer] = state match {
        case List()                      => eh.raiseError(s"Function $name is not declared")
        case (v, n) :: tail if n == name => pure(v)
        case _ :: tail                   => lookupVar(name, tail)
    }

    def assertError[A](m: MError[A]) : Boolean = m match {
        case Left(_) => true
        case Right(_) => false  
    }

}