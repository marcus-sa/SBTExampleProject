name := "SBTExampleProject"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.1",
  "org.scala-lang.modules" %% "scala-async" % "0.9.7",
  "com.softwaremill.macwire" %% "macros" % "2.3.1",
  "com.softwaremill.macwire" %% "util" % "2.3.1",
  "org.scalatest" %% "scalatest" % "3.0.5",
)