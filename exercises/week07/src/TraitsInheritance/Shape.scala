package TraitsInheritance

import com.atomicscala.AtomicTest._

trait Shape {

  def sides: Int

  def perimeter: Double

  def area: Double

}

//updated with subtype -> to be used for all 4 sided shapes
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
