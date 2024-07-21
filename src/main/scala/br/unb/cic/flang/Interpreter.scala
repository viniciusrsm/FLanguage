package br.unb.cic.flang

import Declarations._
import MonadStateError._

object Interpreter{
  def eval(expr: Expr, declarations: List[FDeclaration]): ErrorOrState[Integer] =
    expr match {
      case CInt(v) => pure(v)
      case Add(lhs, rhs) => for {
        l <- eval(lhs, declarations)
        r <- eval(rhs, declarations)
      } yield l + r
      case Mul(lhs, rhs) => for {
        l <- eval(lhs, declarations)
        r <- eval(rhs, declarations)
      } yield l * r
      case Id(name) => for {
        state <- get
        res <- lookupVar(name, state)
      } yield res
      case App(name, arg) => for {
        value <- eval(arg, declarations)
        fdecl <- lookup(name, declarations)
        s1 <- get
        s2 <- set(declareVar(fdecl.arg, value, s1))
        res <- eval(fdecl.body, declarations)
      } yield res
    }
}
