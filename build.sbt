name := "akka-remote-start"

version := "1.0.0"

scalaVersion := "2.11.11"

resolvers += "local-central" at "http://192.168.1.100:8081/nexus/content/repositories/releases/"

externalResolvers <<= resolvers map { rs =>
  Resolver.withDefaultResolvers(rs, mavenCentral = true)
}

lazy val akkaVersion = "2.5.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "com.typesafe" % "config" % "1.3.1",
  "com.dblazejewski" %% "common-model" % "1.0.2",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
