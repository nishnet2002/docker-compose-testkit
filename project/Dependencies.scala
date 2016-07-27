// Copyright 2016 Carl Pulley

import sbt._

object Dependencies {
  val scalaVersion = "2.11.8"

  object akka {
    private val version = "2.4.7"

    val actor = "com.typesafe.akka" %% "akka-actor" % version
    val cluster = "com.typesafe.akka" %% "akka-cluster" % version
    val contrib = "com.typesafe.akka" %% "akka-contrib" % version

    object http {
      val core = "com.typesafe.akka" %% "akka-http-core" % version
      val experimental = "com.typesafe.akka" %% "akka-http-experimental" % version
      val testkit = "com.typesafe.akka" %% "akka-http-testkit" % version
    }

    val slf4j = "com.typesafe.akka" %% "akka-slf4j" % version
  }

  val java8Compat = "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0-RC3"

  object json4s {
    private val version = "3.3.0"

    val jackson = "org.json4s" %% "json4s-jackson" % version
    val native = "org.json4s" %% "json4s-native" % version
  }

  val logback = "ch.qos.logback" % "logback-classic" % "1.1.7"

  object monix {
    private val version = "2.0-RC6"

    val core = "io.monix" %% "monix" % "2.0-RC6"
    val reactive = "io.monix" %% "monix-reactive" % version
  }

  val pprint = "com.lihaoyi" %% "pprint" % "0.4.1"
  val scalatest = "org.scalatest" %% "scalatest" % "2.2.6"
  val yaml = "net.jcazevedo" %% "moultingyaml" % "0.2"
}
