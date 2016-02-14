package SimpleTime

import com.atomicscala.AtomicTest._

class SimpleTime(val hours: Int, val minutes: Int)

class SimpleTimeDefault(val hours: Int, val minutes: Int = 0)

object SimpleTimeTest extends App {

  //Testing simple time with no default values
  val t = new SimpleTime(hours = 5, minutes = 30)
  t.hours is 5
  t.minutes is 30

  //Testing simple time with with default value 0 for minutes
  val t2 = new SimpleTimeDefault(hours = 10)
  t2.hours is 10
  t2.minutes is 0

  //Checking if default value can be overridden
  val t3 = new SimpleTimeDefault(hours = 10, minutes = 30)
  t2.hours is 10
  t2.minutes is 30
  //it cannot

}
