ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

val jgit_version = "5.0.1.201806211838-r"
lazy val root = (project in file("."))
  .settings(
    name := "sparse_checkout_test",
    idePackagePrefix := Some("ai.chronon"),
    // add dependencies here
    libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit" % jgit_version,
//    libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit.ssh.apache" % jgit_version,
//    libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit.gpg.bc" % jgit_version,

  )
