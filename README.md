## product-collections-example
---------------

This is a sample project using product-collections to load stock prices 
from 1965, calculate the 250 period moving average and plot them both
on a line chart.

### How to run

1  git clone ....
1  sbt run

### Scala versions

The underlying wrapper for jfreechart is only available for scala 2.10.x.  
Product collections exists as an unmanaged jar in the lib directory.