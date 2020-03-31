// Build file for bulding spark scala code in folder src
name := "SparkScalaCIJenkinsWC"
version := "1.0"
scalaVersion := "2.10.5"

val sparkVersion = "2.0.0"

// Base Spark-provided dependencies
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
