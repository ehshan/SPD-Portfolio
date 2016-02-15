package Functions

import com.atomicscala.AtomicTest._

object Anonymous extends App {

  //function to convert age to dog-years
  val dogYears = (age : Int) => age * 7

  //testing function
  dogYears(10) is 70

  //function to convert vector of age to dog-years
  //-> result as string
  var s = ""
  val v = Vector(1, 5, 7, 8)
  v.foreach(age => s += age * 7+" ")

  //testing function applied to vector
  s is "7 35 49 56 "

  //function to square each number in a vector
  //-> result as string
  var s1 = ""
  val numbers = Vector(1, 2, 5, 3, 7)
  numbers.foreach(n => s1 += n * n+" ")

  //testing function applied to vector
  s1 is "1 4 25 9 49 "

}
