import com.atomicscala.AtomicTest._

object Vectors extends App{

  //Vectors

  // Q1
  //vector containing Ints
  var v1 = Vector(1,2,3,4,5,6,7,8,9,10,11)

  //vector containing strings
  var v2 = Vector("a","b","c","d","e")

  //vector containing mixed types
  var v3 = Vector("1",2,3.0,"four",4+1)

  // Q2
  //vector of vectors
  var v4 = Vector(v1,v2,v3)

  // Q3
  var v5 =  Vector("The", "dog", "visited", "the", "fire", "station")

  // printing list
  for( s <- v5 )
    println(s)

  var sentence = v5.mkString(" ")

  sentence.toString is "The dog visited the fire station "


  // Q4
  var v6 = Vector(1,2,3,4,5)

  println("Sum of v6 is " + v6.sum)
  println("Min of v6 is " + v6.min)
  println("Max of v6 is " + v6.max)

  var v7 = Vector(1.0,2.0,3.0,4.0,5.0)

  println("Sum of v7 is " + v7.sum)
  println("Min of v7 is " + v7.min)
  println("Max of v7 is" + v7.max)

  var myVector1 = Vector(1,2,3,4,5)
  var myVector2 = Vector(1,2,3,4,5)

  myVector1 is myVector2

}

