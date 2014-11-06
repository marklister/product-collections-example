libraryDependencies += "com.github.wookietreiber" %% "scala-chart" % "latest.integration"

libraryDependencies += "com.github.marklister" %% "product-collections" % "1.1"

  initialCommands in console := """
  import com.github.marklister.collections.io._
  import com.github.marklister.collections._
"""

  name:="product-collections-example"

  scalaVersion:="2.11.4" //scala-chart does not exist for 2.9.x
