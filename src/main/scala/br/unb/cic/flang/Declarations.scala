package br.unb.cic.flang

import br.unb.cic.flang.MonadStateError._
import br.unb.cic.flang.MonadStateError.eh.raiseError

case class FDeclaration(name: String, arg: String, body: Expr)

object Declarations {

  def lookup(
      name: String,
      declarations: List[FDeclaration]
  ): ErrorOrState[FDeclaration]  = declarations match {
    case List()                                          => raiseError(s"Function $name is not declared")
    case ((f @ FDeclaration(n, a, b)) :: _) if n == name => pure(f)
    case (_ :: fs)                                       => lookup(name, fs)
  }

}
