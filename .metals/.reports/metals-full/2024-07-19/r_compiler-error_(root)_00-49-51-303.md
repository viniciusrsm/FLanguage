file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala
### file%3A%2F%2F%2FC%3A%2FUsers%2FVinicius%2FUnB%2FFLanguage%2Fsrc%2Fmain%2Fscala%2Fbr%2Funb%2Fcic%2Fflang%2FMonadState.scala:8: error: illegal start of declaration
    type M = State[S, String]{ state =>
                               ^

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.14
Classpath:
<WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\classes-Metals-zJVNYMnXQiWMQci9rYCJPg== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.10.0\semanticdb-javac-0.10.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.14\scala-library-2.13.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scalactic\scalactic_2.13\3.2.19\scalactic_2.13-3.2.19.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-core_2.13\2.12.0\cats-core_2.13-2.12.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.14\scala-reflect-2.13.14.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-kernel_2.13\2.12.0\cats-kernel_2.13-2.12.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
uri: file:///C:/Users/Vinicius/UnB/FLanguage/src/main/scala/br/unb/cic/flang/MonadState.scala
text:
```scala
package br.unb.cic.flang

import cats.data.State

package object MonadState {
    type S = List[(Integer, String)]

    type M = State[S, String]{ state =>
        (state, s"The state is $state")
    }

    val teste = State[S, String]{ state =>
        (state, s"The state is $state")
    }

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

```



#### Error stacktrace:

```
scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:16)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.Reporter.syntaxError(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter.syntaxError$(Reporter.scala:17)
	scala.meta.internal.parsers.Reporter$$anon$1.syntaxError(Reporter.scala:22)
	scala.meta.internal.parsers.ScalametaParser.refineStat(ScalametaParser.scala:4163)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$refineStatSeq$1(ScalametaParser.scala:4146)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$refineStatSeq$1$adapted(ScalametaParser.scala:4144)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$listBy(ScalametaParser.scala:555)
	scala.meta.internal.parsers.ScalametaParser.refineStatSeq(ScalametaParser.scala:4144)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$refinementInBraces$2(ScalametaParser.scala:4027)
	scala.meta.internal.parsers.ScalametaParser.inBracesOr(ScalametaParser.scala:254)
	scala.meta.internal.parsers.ScalametaParser.inBraces(ScalametaParser.scala:250)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$refinementInBraces$1(ScalametaParser.scala:4027)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$refineWith$1(ScalametaParser.scala:4010)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:366)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:371)
	scala.meta.internal.parsers.ScalametaParser.refineWith(ScalametaParser.scala:4010)
	scala.meta.internal.parsers.ScalametaParser.refinementInBraces(ScalametaParser.scala:4027)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$refinement(ScalametaParser.scala:4013)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.gatherWithTypes$1(ScalametaParser.scala:929)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.compoundTypeRest(ScalametaParser.scala:942)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.compoundTypeRest$(ScalametaParser.scala:927)
	scala.meta.internal.parsers.ScalametaParser$outPattern$.compoundTypeRest(ScalametaParser.scala:2698)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.$anonfun$compoundType$1(ScalametaParser.scala:924)
	scala.Option.getOrElse(Option.scala:201)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.compoundType(ScalametaParser.scala:922)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.compoundType$(ScalametaParser.scala:922)
	scala.meta.internal.parsers.ScalametaParser$outPattern$.compoundType(ScalametaParser.scala:2698)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.infixType(ScalametaParser.scala:855)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.infixType$(ScalametaParser.scala:854)
	scala.meta.internal.parsers.ScalametaParser$outPattern$.infixType(ScalametaParser.scala:2698)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.infixTypeOrTuple(ScalametaParser.scala:851)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.infixTypeOrTuple$(ScalametaParser.scala:849)
	scala.meta.internal.parsers.ScalametaParser$outPattern$.infixTypeOrTuple(ScalametaParser.scala:2698)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.$anonfun$typ$1(ScalametaParser.scala:782)
	scala.meta.internal.parsers.ScalametaParser.atPosOpt(ScalametaParser.scala:321)
	scala.meta.internal.parsers.ScalametaParser.autoPosOpt(ScalametaParser.scala:364)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.typ(ScalametaParser.scala:778)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.typ$(ScalametaParser.scala:778)
	scala.meta.internal.parsers.ScalametaParser$outPattern$.typ(ScalametaParser.scala:2698)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.typeIndentedOpt(ScalametaParser.scala:776)
	scala.meta.internal.parsers.ScalametaParser$PatternContextSensitive.typeIndentedOpt$(ScalametaParser.scala:775)
	scala.meta.internal.parsers.ScalametaParser$outPattern$.typeIndentedOpt(ScalametaParser.scala:2698)
	scala.meta.internal.parsers.ScalametaParser.typeIndentedOpt(ScalametaParser.scala:2716)
	scala.meta.internal.parsers.ScalametaParser.aliasType$1(ScalametaParser.scala:3549)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$typeDefOrDcl$1(ScalametaParser.scala:3565)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:366)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:371)
	scala.meta.internal.parsers.ScalametaParser.typeDefOrDcl(ScalametaParser.scala:3537)
	scala.meta.internal.parsers.ScalametaParser.defOrDclOrSecondaryCtor(ScalametaParser.scala:3305)
	scala.meta.internal.parsers.ScalametaParser.nonLocalDefOrDcl(ScalametaParser.scala:3283)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$templateStat$1.applyOrElse(ScalametaParser.scala:4137)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$templateStat$1.applyOrElse(ScalametaParser.scala:4134)
	scala.PartialFunction.$anonfun$runWith$1(PartialFunction.scala:231)
	scala.PartialFunction.$anonfun$runWith$1$adapted(PartialFunction.scala:230)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4094)
	scala.meta.internal.parsers.ScalametaParser.getStats$2(ScalametaParser.scala:4124)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$scala$meta$internal$parsers$ScalametaParser$$templateStatSeq$3(ScalametaParser.scala:4125)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$scala$meta$internal$parsers$ScalametaParser$$templateStatSeq$3$adapted(ScalametaParser.scala:4123)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$listBy(ScalametaParser.scala:555)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$templateStatSeq(ScalametaParser.scala:4123)
	scala.meta.internal.parsers.ScalametaParser.scala$meta$internal$parsers$ScalametaParser$$templateStatSeq(ScalametaParser.scala:4115)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$templateBody$1(ScalametaParser.scala:3993)
	scala.meta.internal.parsers.ScalametaParser.inBracesOr(ScalametaParser.scala:254)
	scala.meta.internal.parsers.ScalametaParser.inBraces(ScalametaParser.scala:250)
	scala.meta.internal.parsers.ScalametaParser.templateBody(ScalametaParser.scala:3993)
	scala.meta.internal.parsers.ScalametaParser.templateBodyOpt(ScalametaParser.scala:3996)
	scala.meta.internal.parsers.ScalametaParser.templateAfterExtends(ScalametaParser.scala:3947)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$templateOpt$1(ScalametaParser.scala:3988)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:363)
	scala.meta.internal.parsers.ScalametaParser.templateOpt(ScalametaParser.scala:3980)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$packageOrPackageObjectDef$1(ScalametaParser.scala:4243)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:363)
	scala.meta.internal.parsers.ScalametaParser.packageOrPackageObjectDef(ScalametaParser.scala:4241)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4105)
	scala.meta.internal.parsers.ScalametaParser$$anonfun$2.applyOrElse(ScalametaParser.scala:4102)
	scala.PartialFunction.$anonfun$runWith$1(PartialFunction.scala:231)
	scala.PartialFunction.$anonfun$runWith$1$adapted(PartialFunction.scala:230)
	scala.meta.internal.parsers.ScalametaParser.statSeqBuf(ScalametaParser.scala:4094)
	scala.meta.internal.parsers.ScalametaParser.bracelessPackageStats$1(ScalametaParser.scala:4288)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$11(ScalametaParser.scala:4300)
	scala.meta.internal.parsers.ScalametaParser.autoEndPos(ScalametaParser.scala:366)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$10(ScalametaParser.scala:4300)
	scala.meta.internal.parsers.ScalametaParser.tryParse(ScalametaParser.scala:206)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$batchSource$1(ScalametaParser.scala:4292)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:363)
	scala.meta.internal.parsers.ScalametaParser.batchSource(ScalametaParser.scala:4261)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$source$1(ScalametaParser.scala:4255)
	scala.meta.internal.parsers.ScalametaParser.atPos(ScalametaParser.scala:319)
	scala.meta.internal.parsers.ScalametaParser.autoPos(ScalametaParser.scala:363)
	scala.meta.internal.parsers.ScalametaParser.source(ScalametaParser.scala:4255)
	scala.meta.internal.parsers.ScalametaParser.entrypointSource(ScalametaParser.scala:4259)
	scala.meta.internal.parsers.ScalametaParser.parseSourceImpl(ScalametaParser.scala:119)
	scala.meta.internal.parsers.ScalametaParser.$anonfun$parseSource$1(ScalametaParser.scala:116)
	scala.meta.internal.parsers.ScalametaParser.parseRuleAfterBOF(ScalametaParser.scala:58)
	scala.meta.internal.parsers.ScalametaParser.parseRule(ScalametaParser.scala:53)
	scala.meta.internal.parsers.ScalametaParser.parseSource(ScalametaParser.scala:116)
	scala.meta.parsers.Parse$.$anonfun$parseSource$1(Parse.scala:30)
	scala.meta.parsers.Parse$$anon$1.apply(Parse.scala:37)
	scala.meta.parsers.Api$XtensionParseDialectInput.parse(Api.scala:22)
	scala.meta.internal.semanticdb.scalac.ParseOps$XtensionCompilationUnitSource.toSource(ParseOps.scala:15)
	scala.meta.internal.semanticdb.scalac.TextDocumentOps$XtensionCompilationUnitDocument.toTextDocument(TextDocumentOps.scala:179)
	scala.meta.internal.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:54)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticdbTextDocument$1(ScalaPresentationCompiler.scala:462)
```
#### Short summary: 

file%3A%2F%2F%2FC%3A%2FUsers%2FVinicius%2FUnB%2FFLanguage%2Fsrc%2Fmain%2Fscala%2Fbr%2Funb%2Fcic%2Fflang%2FMonadState.scala:8: error: illegal start of declaration
    type M = State[S, String]{ state =>
                               ^