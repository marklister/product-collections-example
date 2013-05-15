libraryDependencies += "com.github.wookietreiber" %% "scala-chart" % "latest.integration"

  initialCommands in console := """
  import org.catch22.collections.io._
  import org.catch22.collections._
"""

  name:="product-collections-example"

  scalaVersion:="2.10.1" //scala-chart does not exist for 2.9.x