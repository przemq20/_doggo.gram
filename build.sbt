ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "doggogram"
  )

// https://mvnrepository.com/artifact/com.github.instagram4j/instagram4j
libraryDependencies ++= Seq(
  "com.github.instagram4j" % "instagram4j" % "2.0.7",
  "org.slf4j" % "slf4j-api" % "1.7.36",
  "org.slf4j" % "slf4j-simple" % "1.7.36" % Test

)

