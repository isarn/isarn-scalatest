name := "isarn-scalatest"

organization := "org.isarnproject"
bintrayOrganization := Some("isarn")

version := "0.0.1"

scalaVersion := "2.10.6"

crossScalaVersions := Seq("2.10.6", "2.11.8")

def commonSettings = Seq(
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.2.4"
  )
)

seq(commonSettings:_*)

licenses += ("Apache-2.0", url("http://opensource.org/licenses/Apache-2.0"))

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

scalacOptions in (Compile, doc) ++= Seq("-doc-root-content", baseDirectory.value+"/root-doc.txt")

site.settings

site.includeScaladoc()

// enable to support jekyll pages
// site.jekyllSupport()

ghpages.settings

git.remoteRepo := "git@github.com:isarn/isarn-scalatest.git"
