resolvers += "JCenter" at "https://jcenter.bintray.com"

libraryDependencies += "com.github.wookietreiber" %% "scala-chart" % "latest.integration"

libraryDependencies += "com.github.marklister" %% "product-collections" % "1.0-RC1"

  initialCommands in console := """
  import com.github.marklister.collections.io._
  import com.github.marklister.collections._
"""

  name:="product-collections-example"

  scalaVersion:="2.11.2" //scala-chart does not exist for 2.9.x
