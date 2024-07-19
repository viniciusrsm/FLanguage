error id: file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala:[171..172) in Input.VirtualFile("file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala", "package br.unb.cic.flang

import cats.data.State

package object MonadState {
    type S = List[(Integer, String)]

    case class M[A](f: S => (S, A))

    type [S, A](a: A) = State[S,A]

    val teste = State[S, String]{ state =>
        (state, s"The state is $state")
    }

    def statePure[A](a: A) = State.pure()

    /* def sla[A] = State[S, Int]{ state =>
        val (a, s1) = State.apply()
        (state, s"The state is $state")
    } */

    //teste.run(List((1, "a")))


    def declareVar(name: String, value: Integer, state: S): S =
        (value, name) :: state

    def lookupVar(name: String, state: S): Integer = state match {
        case List()                      => ???
        case (v, n) :: tail if n == name => v
        case _ :: tail                   => lookupVar(name, tail)
    }

}
")
file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala
file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala:10: error: expected identifier; obtained lbracket
    type [S, A](a: A) = State[S,A]
         ^
#### Short summary: 

expected identifier; obtained lbracket