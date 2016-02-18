package TraitsInheritance

import com.atomicscala.AtomicTest._

sealed trait Shape {

  def sides: Int

  def perimeter: Double

  def area: Double

}

//updated with subtype
trait Rectangular extends Shape{

  val length: Double

  val width: Double

  def sides: Int = 4

  def perimeter: Double = (length * 2) + (width * 2)

  def area: Double = length * width

}

case class Circle(radius: Double) extends Shape{

  def sides: Int = 1

  def perimeter: Double = (math.Pi * 2) * radius

  def area: Double = (math.Pi * radius) * radius
}

case class Rectangle(length: Double, width: Double ) extends Rectangular


case class Square(length: Double) extends Rectangular{

  val width: Double = length
}


object ShapeTest extends App{

  //create a new circle shape
  val circle: Shape = Circle(5)

  //testing methods correctly implemented
  circle.sides is 1
  circle.perimeter is 31.41592653589793
  circle.area is 78.53981633974483


  //create a new rectangle shape
  val rectangle: Shape = Rectangle(4,5)

  //testing methods correctly implemented
  rectangle.sides is 4
  rectangle.perimeter is 18.0
  rectangle.area is 20.0


  //create a new square shape
  val square: Shape = Square(3)

  //testing methods correctly implemented
  square.sides is 4
  square.perimeter is 12
  square.area is 9

}

object Draw {

  def apply(shape: Shape): String = shape match {

    case Circle(radius) => "A circle of radius " + radius + "cm"

    case Rectangle(length, width) => "A rectangle of length " + length +"cm and width " + width + "cm"

    case Square(length) => "A square of length " + length + "cm"

  }

}

//testing draw methods
object DrawTest extends App{

  Draw(Circle(10)) is "A circle of radius 10.0cm"

  Draw(Rectangle(3,4)) is "A rectangle of length 3.0cm and width 4.0cm"

  Draw(Square(4)) is "A square of length 4.0cm"

}
