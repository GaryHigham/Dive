addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")


lazy val root = (project in file(".")).dependsOn(assemblyPlugin)

lazy val assemblyPlugin = uri("/Users/highag01/Documents/workspace/sbt-lwjgl-plugin")
