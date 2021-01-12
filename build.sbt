name := "so-65682326"

scalaVersion := "2.13.4"

scalafmtOnCompile := true

resolvers += "Sonatype OSS Snapshots" at
  "https://oss.sonatype.org/content/repositories/releases"

libraryDependencies ++= Seq(
  "com.storm-enroute" %% "scalameter" % "0.20",
  "com.storm-enroute" %% "scalameter-core" % "0.20"
)

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

parallelExecution in Test := false

fork := true

outputStrategy := Some(StdoutOutput)

connectInput := true