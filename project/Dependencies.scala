import sbt._


object Dependencies {

  import Versions._

  val scalatest = "org.scalatest" %% "scalatest" % Scalatest % "test"
  val logback = "ch.qos.logback" % "logback-classic" % Logback % "test"

}