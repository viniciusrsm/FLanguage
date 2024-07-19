file:///C:/Users/Vinicius/UnB/FLanguage/src/test/scala/br/unb/cic/flang/MonadTest.scala
### scala.reflect.internal.FatalError: 
  ThisType(value <local MonadTest>) for sym which is not a class
     while compiling: file:///C:/Users/Vinicius/UnB/FLanguage/src/test/scala/br/unb/cic/flang/MonadTest.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.14
    compiler version: version 2.13.14
  reconstructed args: -classpath <WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\test-classes-Metals-zJVNYMnXQiWMQci9rYCJPg==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.0\semanticdb-javac-0.10.0.jar;<WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\classes-Metals-zJVNYMnXQiWMQci9rYCJPg==;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalactic\scalactic_2.13\3.2.19\scalactic_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest_2.13\3.2.19\scalatest_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-core_2.13\2.12.0\cats-core_2.13-2.12.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.14\scala-reflect-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-core_2.13\3.2.19\scalatest-core_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-featurespec_2.13\3.2.19\scalatest-featurespec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-flatspec_2.13\3.2.19\scalatest-flatspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-freespec_2.13\3.2.19\scalatest-freespec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funsuite_2.13\3.2.19\scalatest-funsuite_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funspec_2.13\3.2.19\scalatest-funspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-propspec_2.13\3.2.19\scalatest-propspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-refspec_2.13\3.2.19\scalatest-refspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-wordspec_2.13\3.2.19\scalatest-wordspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-diagrams_2.13\3.2.19\scalatest-diagrams_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-matchers-core_2.13\3.2.19\scalatest-matchers-core_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-shouldmatchers_2.13\3.2.19\scalatest-shouldmatchers_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-mustmatchers_2.13\3.2.19\scalatest-mustmatchers_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-kernel_2.13\2.12.0\cats-kernel_2.13-2.12.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-compatible\3.2.19\scalatest-compatible-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-xml_2.13\2.1.0\scala-xml_2.13-2.1.0.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Literal(Constant(5))
       tree position: line 22 of file:///C:/Users/Vinicius/UnB/FLanguage/src/test/scala/br/unb/cic/flang/MonadTest.scala
            tree tpe: Int(5)
              symbol: null
           call site: <none> in <none>

== Source file context for tree position ==

    19     //val (res, _) = runState(eval(c5, declarations))(initialState)
    20 
    21     val _CURSOR_res = 5
    22     res should be (5)
    23   }
    24 
    25   "eval Add(CInt(5), CInt(10)) " should "return an integer value 15." in {

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.14
Classpath:
<WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\test-classes-Metals-zJVNYMnXQiWMQci9rYCJPg== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.0\semanticdb-javac-0.10.0.jar [exists ], <WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\classes-Metals-zJVNYMnXQiWMQci9rYCJPg== [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalactic\scalactic_2.13\3.2.19\scalactic_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest_2.13\3.2.19\scalatest_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-core_2.13\2.12.0\cats-core_2.13-2.12.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.14\scala-reflect-2.13.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-core_2.13\3.2.19\scalatest-core_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-featurespec_2.13\3.2.19\scalatest-featurespec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-flatspec_2.13\3.2.19\scalatest-flatspec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-freespec_2.13\3.2.19\scalatest-freespec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funsuite_2.13\3.2.19\scalatest-funsuite_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funspec_2.13\3.2.19\scalatest-funspec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-propspec_2.13\3.2.19\scalatest-propspec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-refspec_2.13\3.2.19\scalatest-refspec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-wordspec_2.13\3.2.19\scalatest-wordspec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-diagrams_2.13\3.2.19\scalatest-diagrams_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-matchers-core_2.13\3.2.19\scalatest-matchers-core_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-shouldmatchers_2.13\3.2.19\scalatest-shouldmatchers_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-mustmatchers_2.13\3.2.19\scalatest-mustmatchers_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-kernel_2.13\2.12.0\cats-kernel_2.13-2.12.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-compatible\3.2.19\scalatest-compatible-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-xml_2.13\2.1.0\scala-xml_2.13-2.1.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 448
uri: file:///C:/Users/Vinicius/UnB/FLanguage/src/test/scala/br/unb/cic/flang/MonadTest.scala
text:
```scala
package br.unb.cic.flang

import org.scalatest._

import flatspec._
import matchers._
import MonadState._

class MonadTest extends AnyFlatSpec with should.Matchers {

  val inc = FDeclaration("inc", "x", Add(Id("x"), CInt(1)))

  val declarations = List(inc)

  val initialState: S = List()

  "eval CInt(5)" should "return an integer value 5." in {
    val c5 = CInt(5)
    //val (res, _) = runState(eval(c5, declarations))(initialState)

    val @@res = 5
    res should be (5)
  }

  "eval Add(CInt(5), CInt(10)) " should "return an integer value 15." in {
    val c5  = CInt(5)
    val c10 = CInt(10)
    val add = Add(c5, c10)
    val (res, _) = runState(eval(add, declarations))(initialState)
    res should be (15)
  }

  "eval Add(CInt(5), Add(CInt(5), CInt(10))) " should "return an integer value 20." in {
    val c5 = CInt(5)
    val c10 = CInt(10)
    val add = Add(c5, Add(c5, c10))
    val (res, _) = runState(eval(add, declarations))(initialState)
    res should be(20)
  }

  "eval Mul(CInt(5), CInt(10))" should "return an integer value 50" in {
    val c5 = CInt(5)
    val c10 = CInt(10)
    val mul = Mul(c5, CInt(10))
    val (res, _) = runState(eval(mul, declarations))(initialState)
    res should be(50)
  }

  "eval App(inc, 99) " should "return an integer value 100" in {
    val app = App("inc", CInt(99))
    val (res, _) = runState(eval(app, declarations))(initialState)
    res should be (100)
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
  ThisType(value <local MonadTest>) for sym which is not a class
     while compiling: file:///C:/Users/Vinicius/UnB/FLanguage/src/test/scala/br/unb/cic/flang/MonadTest.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.14
    compiler version: version 2.13.14
  reconstructed args: -classpath <WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\test-classes-Metals-zJVNYMnXQiWMQci9rYCJPg==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.0\semanticdb-javac-0.10.0.jar;<WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\classes-Metals-zJVNYMnXQiWMQci9rYCJPg==;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalactic\scalactic_2.13\3.2.19\scalactic_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest_2.13\3.2.19\scalatest_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-core_2.13\2.12.0\cats-core_2.13-2.12.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.14\scala-reflect-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-core_2.13\3.2.19\scalatest-core_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-featurespec_2.13\3.2.19\scalatest-featurespec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-flatspec_2.13\3.2.19\scalatest-flatspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-freespec_2.13\3.2.19\scalatest-freespec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funsuite_2.13\3.2.19\scalatest-funsuite_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funspec_2.13\3.2.19\scalatest-funspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-propspec_2.13\3.2.19\scalatest-propspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-refspec_2.13\3.2.19\scalatest-refspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-wordspec_2.13\3.2.19\scalatest-wordspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-diagrams_2.13\3.2.19\scalatest-diagrams_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-matchers-core_2.13\3.2.19\scalatest-matchers-core_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-shouldmatchers_2.13\3.2.19\scalatest-shouldmatchers_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-mustmatchers_2.13\3.2.19\scalatest-mustmatchers_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-kernel_2.13\2.12.0\cats-kernel_2.13-2.12.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-compatible\3.2.19\scalatest-compatible-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-xml_2.13\2.1.0\scala-xml_2.13-2.1.0.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Literal(Constant(5))
       tree position: line 22 of file:///C:/Users/Vinicius/UnB/FLanguage/src/test/scala/br/unb/cic/flang/MonadTest.scala
            tree tpe: Int(5)
              symbol: null
           call site: <none> in <none>

== Source file context for tree position ==

    19     //val (res, _) = runState(eval(c5, declarations))(initialState)
    20 
    21     val _CURSOR_res = 5
    22     res should be (5)
    23   }
    24 
    25   "eval Add(CInt(5), CInt(10)) " should "return an integer value 15." in {