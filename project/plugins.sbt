resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("com.geirsson"  % "sbt-ci-release" % "1.5.4")
addSbtPlugin("com.eed3si9n"  % "sbt-assembly"   % "0.14.10")
addSbtPlugin("org.scalameta" % "sbt-scalafmt"   % "2.4.2")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix"   % "0.9.25")
addSbtPlugin("org.scoverage" % "sbt-scoverage"  % "1.6.1")

if (System.getProperty("add-scapegoat-plugin") == "true")
  addSbtPlugin(s"com.sksamuel.scapegoat" % "sbt-scapegoat" % "1.1.0")
else Seq.empty
