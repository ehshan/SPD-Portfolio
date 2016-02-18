package MapReduce

import com.atomicscala.AtomicTest._

object Mapping extends App{

  //vector to be used
  val v = Vector(1, 2, 3, 4)

  //function to +1 to each value in vector
  v.map(n => n + 1) is Vector(2, 3, 4, 5)

  //function to x11 and +10 to each value in vector
  v.map(n => n * 11 + 10) is Vector(21, 32, 43, 54)

  //testing replacing a mapping with foreach for vector v
  //creates error -> no value returned
  val v2 = v.foreach(n => n * 11 + 10) is ()

  //testing replacing a mapping with for loop for vector v
  //correct result
  val v3 = for (n <- v) yield n * 11 + 10
  v3 is Vector(21, 32, 43, 54)

  //testing replacing a mapping with for loop for vector v
  //correct result
  val v4 = for (n <- v) yield n + 1
  v4 is Vector(2, 3, 4, 5)


  //vector used for reduce
  val r = Vector(1, 10, 100, 1000)

  r.reduce((sum, n) => sum + n) is 1111
  //can just use r.sum here
  r.sum is 1111

  //testing replacing reduce with a for loop
  //same result
  var sum = 0
  for (num <- r) sum += num
  sum is 1111

  //method to sum all passes Ints
  def sumIt(nums: Int*) = nums.reduce((sum, n) => sum + n)

  //testing method
  sumIt(1, 2, 3) is 6
  sumIt(45, 45, 45, 60) is 195

}
