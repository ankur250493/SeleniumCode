import sbt.Keys.libraryDependencies

name := "scalaTest"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  "org.scalatestplus" %% "selenium-3-141" % "3.2.2.0" % "test",
  "org.scalatest" %% "scalatest-flatspec" % "3.2.2" % "test",
  "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.2" % "test",
  "org.scalatest" %% "scalatest-funsuite" % "3.2.2" % "test",
  "org.apache.poi" % "poi" % "5.0.0",
"org.apache.poi" % "poi-ooxml" % "5.0.0",
 "org.apache.poi" % "poi" % "5.0.0",
 "org.testng" % "testng" % "7.1.0" % "test"

//    "org.apache.poi" % "poi-ooxml" % "3.13",
// "org.apache.poi" % "poi-ooxml-schemas" % "3.13",
// "org.apache.poi" % "poi-scratchpad" % "3.13",
// "org.apache.poi" % "poi" % "3.13",
// "org.apache.poi" % "poi-excelant" % "3.13",
)