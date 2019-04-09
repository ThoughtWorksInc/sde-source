organization in ThisBuild := "com.thoughtworks.sde"

publish / skip := true

// Workaround for randomly Travis CI fail
parallelExecution in Global := false

fork in Global in compile := true

description in ThisBuild := "A collection of Scala language extension for specific domains."

lazy val source = crossProject.crossType(CrossType.Pure)

lazy val sourceJS = source.js

lazy val sourceJVM = source.jvm

startYear in ThisBuild := Some(2015)
