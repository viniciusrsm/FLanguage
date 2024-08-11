package br.unb.cic.flang

sealed trait Expr

case class CInt(v: Int) extends Expr
case class CBool(v: Boolean) extends Expr
case class IfThenElse(eIf: Expr, eThen: Expr, eElse: Expr) extends Expr
case class Add(lhs: Expr, rhs: Expr) extends Expr
case class Mul(lhs: Expr, rhs: Expr) extends Expr
case class Id(name: String) extends Expr
case class App(name: String, arg: Expr) extends Expr