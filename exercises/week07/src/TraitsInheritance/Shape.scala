package TraitsInheritance

import com.atomicscala.AtomicTest._

sealed trait Shape {

  def sides: Int

  def perimeter: Double

  def area: Double

  //added colour as member
  def colour: Colour

}

//updated with subtype
trait Rectangular extends Shape{

  val length: Double

  val width: Double

  def sides: Int = 4

  def perimeter: Double = (length * 2) + (width * 2)

  def area: Double = length * width

}

case class Circle(radius: Double, colour: Colour) extends Shape{

  def sides: Int = 1

  def perimeter: Double = (math.Pi * 2) * radius

  def area: Double = (math.Pi * radius) * radius
}

case class Rectangle(length: Double, width: Double, colour: Colour ) extends Rectangular


case class Square(length: Double, colour: Colour) extends Rectangular{

  val width: Double = length
}


object ShapeTest extends App{

  //create a new circle shape
  val circle: Shape = Circle(5, Yellow)

  //testing methods correctly implemented
  circle.sides is 1
  circle.perimeter is 31.41592653589793
  circle.area is 78.53981633974483

  //added test for colour
  circle.colour is Yellow


  //create a new rectangle shape
  val rectangle: Shape = Rectangle(4,5, Red)

  //testing methods correctly implemented
  rectangle.sides is 4
  rectangle.perimeter is 18.0
  rectangle.area is 20.0

  //added test for colour
  rectangle.colour is Red


  //create a new square shape
  val square: Shape = Square(3,Pink)

  //testing methods correctly implemented
  square.sides is 4
  square.perimeter is 12
  square.area is 9

  //added test for colour
  square.colour is Pink

}

object Draw {

  def apply(shape: Shape): String = shape match {

    case  Circle(radius, colour) => "A circle of radius " + radius + "cm and colour "+colour.toString

    case  Rectangle(length, width, colour) => "A rectangle of length " + length +"cm and width " + width +
          "cm and colour "+colour.toString

    case  Square(length, colour) => "A square of length " + length + "cm and colour "+colour.toString

  }

}

//testing draw methods
object DrawTest extends App{

  Draw(Circle(10, Yellow)) is "A circle of radius 10.0cm and colour Yellow"

  Draw(Rectangle(3, 4, Red)) is "A rectangle of length 3.0cm and width 4.0cm and colour Red"

  Draw(Square(4, Pink)) is "A square of length 4.0cm and colour Pink"

  Draw(Square(4, NewColour(0,0,0))) is "A square of length 4.0cm and colour Dark"

}
