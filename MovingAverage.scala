/*
 * This is a sample project using CollSeq to create a graph of Historical
 * Stock prices (courtesy of Yahoo finance -- thanks!)
 */
import com.github.marklister.collections._
import com.github.marklister.collections.io._
import scalax.chart._
import scalax.chart.api._
import java.util.Date
import org.jfree.data.time.Day

object MovingAverage {
  def main(args: Array[String]): Unit = {
    val p= CsvParser[Date,Double,Double,Double,Double,Double,Double]  //Date,Open,High,Low,Close,Volume,Adj Close
    implicit val ymd=new DateConverter("yyyy-MM-dd")
    val data = p.parseFile("ibm.csv",hasHeader=true).sortBy(_._1)
    val movingAverage= data._7.sliding(250).toList.map(_.mean)
    val maPlot=data._1.take(250).map(d=>(d,0.0))++data._1.drop(250).zip(movingAverage)
    //converts Dates to jfree.data.time.TimeSeries Days
    implicit def dateToDay(d:Date)= new Day(d)
    val dataSet= data._1.zip(data._7).toTimeSeriesCollection("Adjusted close") 
    dataSet.addSeries(maPlot.toTimeSeries("250ma"))        
    XYLineChart(dataSet,title="IBM prices").show()
  }
}
