file:///C:/Users/Vinicius/UnB/FLanguage/src/test/scala/br/unb/cic/flang/MonadTest.scala
### scala.reflect.internal.FatalError: 
  ThisType(value <local MonadTest>) for sym which is not a class
     while compiling: file:///C:/Users/Vinicius/UnB/FLanguage/src/test/scala/br/unb/cic/flang/MonadTest.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.14
    compiler version: version 2.13.14
  reconstructed args: -classpath <WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\test-classes-Metals-WTpbZBIxStme4Oo4E7y0dQ==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.0\semanticdb-javac-0.10.0.jar;<WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\classes-Metals-WTpbZBIxStme4Oo4E7y0dQ==;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalactic\scalactic_2.13\3.2.19\scalactic_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest_2.13\3.2.19\scalatest_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-core_2.13\2.12.0\cats-core_2.13-2.12.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.14\scala-reflect-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-core_2.13\3.2.19\scalatest-core_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-featurespec_2.13\3.2.19\scalatest-featurespec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-flatspec_2.13\3.2.19\scalatest-flatspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-freespec_2.13\3.2.19\scalatest-freespec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funsuite_2.13\3.2.19\scalatest-funsuite_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funspec_2.13\3.2.19\scalatest-funspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-propspec_2.13\3.2.19\scalatest-propspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-refspec_2.13\3.2.19\scalatest-refspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-wordspec_2.13\3.2.19\scalatest-wordspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-diagrams_2.13\3.2.19\scalatest-diagrams_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-matchers-core_2.13\3.2.19\scalatest-matchers-core_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-shouldmatchers_2.13\3.2.19\scalatest-shouldmatchers_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-mustmatchers_2.13\3.2.19\scalatest-mustmatchers_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-kernel_2.13\2.12.0\cats-kernel_2.13-2.12.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-compatible\3.2.19\scalatest-compatible-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-xml_2.13\2.1.0\scala-xml_2.13-2.1.0.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Apply(method apply)
       tree position: line 46 of file:///C:/Users/Vinicius/UnB/FLanguage/src/test/scala/br/unb/cic/flang/MonadTest.scala
            tree tpe: org.scalatest.matchers.Matcher[Any]
              symbol: method apply in class BeWord
   symbol definition: def apply(right: Any): org.scalatest.matchers.Matcher[Any] (a MethodSymbol)
      symbol package: org.scalatest.matchers.dsl
       symbol owners: method apply -> class BeWord
           call site: <none> in <none>

== Source file context for tree position ==

    43     println(res)
    44     println(_CURSOR_b)
    45 
    46     res should be(List((1, "test")))
    47   }
    48 
    49   "declareVar" should "combine two different states" in {

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.14
Classpath:
<WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\test-classes-Metals-WTpbZBIxStme4Oo4E7y0dQ== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.0\semanticdb-javac-0.10.0.jar [exists ], <WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\classes-Metals-WTpbZBIxStme4Oo4E7y0dQ== [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalactic\scalactic_2.13\3.2.19\scalactic_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest_2.13\3.2.19\scalatest_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-core_2.13\2.12.0\cats-core_2.13-2.12.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.14\scala-reflect-2.13.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-core_2.13\3.2.19\scalatest-core_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-featurespec_2.13\3.2.19\scalatest-featurespec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-flatspec_2.13\3.2.19\scalatest-flatspec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-freespec_2.13\3.2.19\scalatest-freespec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funsuite_2.13\3.2.19\scalatest-funsuite_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funspec_2.13\3.2.19\scalatest-funspec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-propspec_2.13\3.2.19\scalatest-propspec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-refspec_2.13\3.2.19\scalatest-refspec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-wordspec_2.13\3.2.19\scalatest-wordspec_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-diagrams_2.13\3.2.19\scalatest-diagrams_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-matchers-core_2.13\3.2.19\scalatest-matchers-core_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-shouldmatchers_2.13\3.2.19\scalatest-shouldmatchers_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-mustmatchers_2.13\3.2.19\scalatest-mustmatchers_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-kernel_2.13\2.12.0\cats-kernel_2.13-2.12.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-compatible\3.2.19\scalatest-compatible-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-xml_2.13\2.1.0\scala-xml_2.13-2.1.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 922
uri: file:///C:/Users/Vinicius/UnB/FLanguage/src/test/scala/br/unb/cic/flang/MonadTest.scala
text:
```scala
package br.unb.cic.flang

import br.unb.cic.flang.Interpreter._
import cats.data.State
import org.scalatest._

import flatspec._
import matchers._
import MonadState._
import Declarations._

class MonadTest extends AnyFlatSpec with should.Matchers {

  val inc = FDeclaration("inc", "x", Add(Id("x"), CInt(1)))

  val declarations = List(inc)

  val initialState: S = List()

  "pure" should "run and return 10" in {
    val step1 = pure(10)
    val (b, res) = runState(step1)(initialState)
    
    println(res)
    println(b)


    res should be(10)
  }

  "put" should "run and return List((1, test))" in {
    val step1 = put(List((1, "test")))
    val (res, _) = runState(step1)(initialState)

    res should be(List((1, "test")))
  }

  "get" should "run and return List((1, test))" in {
    val step1 = get
    val state: S = List((5, "test"))
    val (_, res) = runState(step1)(state)

    println(res)
    println(@@b)

    res should be(List((1, "test")))
  }

  "declareVar" should "combine two different states" in {
    val test1 = declareVar("test_1", 10, initialState)
    val res = declareVar("test_2", 20, test1)

    res should be(List((20, "test_2"), (10, "test_1")))
  }

  "lookupVar" should "find state by name" in {
    val test1 = declareVar("test_1", 10, initialState)
    val test2 = declareVar("test_2", 20, test1)

    val res = lookupVar("test_2", test2)

    res should be(20)
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
  reconstructed args: -classpath <WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\test-classes-Metals-WTpbZBIxStme4Oo4E7y0dQ==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.0\semanticdb-javac-0.10.0.jar;<WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\classes-Metals-WTpbZBIxStme4Oo4E7y0dQ==;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalactic\scalactic_2.13\3.2.19\scalactic_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest_2.13\3.2.19\scalatest_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-core_2.13\2.12.0\cats-core_2.13-2.12.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.14\scala-reflect-2.13.14.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-core_2.13\3.2.19\scalatest-core_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-featurespec_2.13\3.2.19\scalatest-featurespec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-flatspec_2.13\3.2.19\scalatest-flatspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-freespec_2.13\3.2.19\scalatest-freespec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funsuite_2.13\3.2.19\scalatest-funsuite_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-funspec_2.13\3.2.19\scalatest-funspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-propspec_2.13\3.2.19\scalatest-propspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-refspec_2.13\3.2.19\scalatest-refspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-wordspec_2.13\3.2.19\scalatest-wordspec_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-diagrams_2.13\3.2.19\scalatest-diagrams_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-matchers-core_2.13\3.2.19\scalatest-matchers-core_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-shouldmatchers_2.13\3.2.19\scalatest-shouldmatchers_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-mustmatchers_2.13\3.2.19\scalatest-mustmatchers_2.13-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-kernel_2.13\2.12.0\cats-kernel_2.13-2.12.0.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalatest\scalatest-compatible\3.2.19\scalatest-compatible-3.2.19.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-xml_2.13\2.1.0\scala-xml_2.13-2.1.0.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Apply(method apply)
       tree position: line 46 of file:///C:/Users/Vinicius/UnB/FLanguage/src/test/scala/br/unb/cic/flang/MonadTest.scala
            tree tpe: org.scalatest.matchers.Matcher[Any]
              symbol: method apply in class BeWord
   symbol definition: def apply(right: Any): org.scalatest.matchers.Matcher[Any] (a MethodSymbol)
      symbol package: org.scalatest.matchers.dsl
       symbol owners: method apply -> class BeWord
           call site: <none> in <none>

== Source file context for tree position ==

    43     println(res)
    44     println(_CURSOR_b)
    45 
    46     res should be(List((1, "test")))
    47   }
    48 
    49   "declareVar" should "combine two different states" in {