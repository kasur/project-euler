import sbt.Keys._

name := "ProjectEuler"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(Dependencies.logback, Dependencies.scalatest)

scalacOptions in Compile ++= Seq("-encoding", "UTF-8", "-target:jvm-1.7",
  "-deprecation", "-feature", "-unchecked",
  "-Xlog-reflective-calls",
  "-Xlint"
)


fork in run := true