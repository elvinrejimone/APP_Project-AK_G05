name := """play-java-hello-world-tutorial"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.6"

libraryDependencies += guice
libraryDependencies ++= Seq(
javaWs,
caffeine,
"com.google.code.gson" % "gson" % "2.2.4"

)
libraryDependencies += "org.mockito" % "mockito-core" % "2.10.0" % Test

