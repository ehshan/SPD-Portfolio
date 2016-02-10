import com.atomicscala.AtomicTest._

class Cup{

  var percentFull = 0
  val max = 100

  def add(increase: Int): Int = {
    percentFull += increase
    if (percentFull > max) {
      percentFull = max
    }
    percentFull
  }

}

object AtomicTest extends App{

  //new cup - testing for negative values
  val cup = new Cup
  cup.add(45) is 45
  cup.add(-15) is 30
  cup.add(-50) is -20
  //cup is now -20% full

  //new cup - testing if percentage full stop at 0
  val cup0 = new Cup
  cup0.add(45) is 45
  cup0.add(-55) is 0
  cup0.add(10) is 10
  cup0.add(-9) is 1
  cup0.add(-2) is 0
  //produces errors

  //new cup - test setting percentage manually
  val cup01= new Cup
  cup01.percentFull = 56
  cup01.percentFull is 56
  //cannot not set percentage full from outside class

}