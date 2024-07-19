file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala
### scala.reflect.internal.FatalError: 
  ThisType(type MState) for sym which is not a class
     while compiling: file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.14
    compiler version: version 2.13.14
  reconstructed args: -classpath <WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\classes-Metals-WTpbZBIxStme4Oo4E7y0dQ==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.0\semanticdb-javac-0.10.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalactic\scalactic_2.13\3.2.19\scalactic_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-core_2.13\2.12.0\cats-core_2.13-2.12.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.14\scala-reflect-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-kernel_2.13\2.12.0\cats-kernel_2.13-2.12.0.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(S_CURSOR_)
       tree position: line 21 of file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala
            tree tpe: <error>
              symbol: class <error: <none>>
   symbol definition: class <error: <none>> extends  (a ClassSymbol)
      symbol package: br.unb.cic.flang.MonadState
       symbol owners: class <error: <none>> -> method get -> package object MonadState
           call site: <none> in <none>

== Source file context for tree position ==

    18 
    19     def put(s: S): MState[Unit] = State.set(s)
    20 
    21     def get: MState[S] = State[S_CURSOR_,].get
    22 
    23     def declareVar(name: String, value: Integer, state: S): S =
    24         (value, name) :: state

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.14
Classpath:
<WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\classes-Metals-WTpbZBIxStme4Oo4E7y0dQ== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.0\semanticdb-javac-0.10.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalactic\scalactic_2.13\3.2.19\scalactic_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-core_2.13\2.12.0\cats-core_2.13-2.12.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.14\scala-reflect-2.13.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-kernel_2.13\2.12.0\cats-kernel_2.13-2.12.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 522
uri: file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala
text:
```scala
package br.unb.cic.flang

import br.unb.cic.flang.Interpreter2._
import cats.Eval
import cats.data.IndexedStateT
import cats.data.State

package object MonadState {
    type S = List[(Integer, String)]

    //case class M[A](f: S => (S, A))

    type MState[A] = State[S, A]

    def pure[A](a: A): MState[A] = State.pure(a)

    def runState[A](initialState: S, state: MState[A]): (S, A) = state.run(initialState).value

    def put(s: S): MState[Unit] = State.set(s)

    def get: MState[S] = State[S@@,].get

    def declareVar(name: String, value: Integer, state: S): S =
        (value, name) :: state

    def lookupVar(name: String, state: S): Integer = state match {
        case List()                      => ???
        case (v, n) :: tail if n == name => v
        case _ :: tail                   => lookupVar(name, tail)
    }

}

```



#### Error stacktrace:

```
scala.reflect.internal.Reporting.abort(Reporting.scala:70)
	scala.reflect.internal.Reporting.abort$(Reporting.scala:66)
	scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
	scala.reflect.internal.Types$ThisType.<init>(Types.scala:1394)
	scala.reflect.internal.Types$UniqueThisType.<init>(Types.scala:1414)
	scala.reflect.internal.Types$ThisType$.apply(Types.scala:1418)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$autoImports$3.applyOrElse(AutoImportsProvider.scala:74)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$autoImports$3.applyOrElse(AutoImportsProvider.scala:60)
	scala.collection.immutable.List.collect(List.scala:268)
	scala.meta.internal.pc.AutoImportsProvider.autoImports(AutoImportsProvider.scala:60)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$autoImports$1(ScalaPresentationCompiler.scala:299)
```
#### Short summary: 

scala.reflect.internal.FatalError: 
  ThisType(type MState) for sym which is not a class
     while compiling: file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.14
    compiler version: version 2.13.14
  reconstructed args: -classpath <WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\classes-Metals-WTpbZBIxStme4Oo4E7y0dQ==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.0\semanticdb-javac-0.10.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalactic\scalactic_2.13\3.2.19\scalactic_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-core_2.13\2.12.0\cats-core_2.13-2.12.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.14\scala-reflect-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-kernel_2.13\2.12.0\cats-kernel_2.13-2.12.0.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(S_CURSOR_)
       tree position: line 21 of file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala
            tree tpe: <error>
              symbol: class <error: <none>>
   symbol definition: class <error: <none>> extends  (a ClassSymbol)
      symbol package: br.unb.cic.flang.MonadState
       symbol owners: class <error: <none>> -> method get -> package object MonadState
           call site: <none> in <none>

== Source file context for tree position ==

    18 
    19     def put(s: S): MState[Unit] = State.set(s)
    20 
    21     def get: MState[S] = State[S_CURSOR_,].get
    22 
    23     def declareVar(name: String, value: Integer, state: S): S =
    24         (value, name) :: state