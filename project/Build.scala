import sbt._
import Keys._

object BuildSettings {
  //lazy val productCollections = RootProject(uri("git://github.com/marklister/product-collections.git"))
  //lazy val productCollectionsExample = Project(id = "product-collections-example", base = file(".")).dependsOn(productCollections)
  val buildOrganization = "org.catch22"
  val buildVersion      = "0.0.1-SNAPSHOT"
  

  val buildSettings = Defaults.defaultSettings ++ Seq (
    organization := buildOrganization,
    version      := buildVersion)
  
  
}


