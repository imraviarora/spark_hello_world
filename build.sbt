// Build file for bulding spark scala code in folder src
name := "SparkScalaCIJenkinsWC"
version := "1.0"
scalaVersion := "2.12.10"

val sparkVersion = "3.0.0"

// Base Spark-provided dependencies
libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % sparkVersion,
	"org.apache.spark" %% "spark-streaming" % sparkVersion,
	"org.apache.spark" %% "spark-sql" % sparkVersion,
	"org.apache.spark" %% "spark-graphx" % sparkVersion)

