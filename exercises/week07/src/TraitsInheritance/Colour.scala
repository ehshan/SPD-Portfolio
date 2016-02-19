package TraitsInheritance

import com.atomicscala.AtomicTest._

sealed trait Colour {

  val red: Int

  val green: Int

  val blue: Int

  def darkColour : Boolean = (0.33 * red) + (0.5 * green) + (0.16 * blue) < 127.5

}


case class Red() extends Colour {

  val red = 255

  val green = 255

  val blue = 0

}

case class Yellow() extends Colour {

  val red = 255

  val green = 0

  val blue = 0

}

case class Pink() extends Colour {

  val red = 255

  val green = 192

  val blue = 203

}

case class  NewColour(red: Int, green: Int, blue: Int) extends Colour


//testing colour luminance
object TestColour extends App{

  val red: Colour = Red()

  val yellow: Colour = Yellow()

  val pink: Colour = Pink()

  val black: Colour = NewColour(0,0,0)

  val white: Colour = NewColour(255,255,255)

  black.darkColour is true

  white.darkColour is false

}
