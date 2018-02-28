name := "actor-paths"

version := "1.0"

scalaVersion := "2.11.7"

sbtVersion := "0.13.5"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.0",
  //"org.scalatest" %% "scalatest" % "1.9.1" % "test"
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test")
    