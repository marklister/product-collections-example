resolvers += "org.catch22" at "http://marklister.github.io/product-collections/"

libraryDependencies += "com.github.wookietreiber" %% "scala-chart" % "latest.integration"

libraryDependencies += "org.catch22" %% "product-collections" % "0.0.4.2-SNAPSHOT"

  initialCommands in console := """
  import org.catch22.collections.io._
  import org.catch22.collections._
"""

  name:="product-collections-example"

  scalaVersion:="2.10.1" //scala-chart does not exist for 2.9.x