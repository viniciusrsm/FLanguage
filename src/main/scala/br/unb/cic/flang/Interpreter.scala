package br.unb.cic.flang

import Declarations._
import MonadStateError._
import MonadStateError.eh.raiseError


object Interpreter{
  def eval(expr: Expr, declarations: List[FDeclaration]): ErrorOrState[Either[Boolean,Integer]] =
    expr match {
      case CInt(v) => pure(Right(v))
      case CBool(v) => pure(Left(v))
      case IfThenElse(eIf, eThen, eElse) if eIf.isInstanceOf[CBool] => for {
        evalIf <- eval(eIf, declarations)
        val evalIfBool = evalIf.fold(l => l, _ => 0)
        res <- if (evalIfBool == true) eval(eThen, declarations) else eval(eElse, declarations)
      } yield res
      case Add(lhs, rhs) if !lhs.isInstanceOf[CBool] && !rhs.isInstanceOf[CBool] => for {
        l <- eval(lhs, declarations)
        r <- eval(rhs, declarations)
        val lInt:Integer = l.getOrElse(0)
        val rInt:Integer = r.getOrElse(0)
      } yield Right(lInt + rInt)
      case Mul(lhs, rhs) if !lhs.isInstanceOf[CBool] && !rhs.isInstanceOf[CBool] => for {
        l <- eval(lhs, declarations)
        r <- eval(rhs, declarations)
        val lInt:Integer = l.getOrElse(0)
        val rInt:Integer = r.getOrElse(0)
      } yield Right(lInt * rInt)
      case Id(name) => for {
        state <- get
        res <- lookupVar(name, state)
      } yield Right(res)
      case App(name, arg) => for {
        value <- eval(arg, declarations)
        fdecl <- lookup(name, declarations)
        s1 <- get
        s2 <- set(declareVar(fdecl.arg, value.getOrElse(0), s1))
        res <- eval(fdecl.body, declarations)
      } yield res
      case _ => raiseError("Invalid eval expression provided")
    }
}
