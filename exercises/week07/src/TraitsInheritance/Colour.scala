package TraitsInheritance

import com.atomicscala.AtomicTest._

sealed trait Colour {

  val red: Int

  val green: Int

  val blue: Int

  val name: String

  def darkColour: Boolean = (0.33 * red) + (0.5 * green) + (0.16 * blue) < 127.5

  override def toString: String = if (name != null) name else if (darkColour) "Dark" else "Light"

}

//changed defined colours to objects

case object Red extends Colour {

  val red = 255

  val green = 255

  val blue = 0

  val name = "Red"

}

case object Yellow extends Colour {

  val red = 255

  val green = 0

  val blue = 0

  val name = "Yellow"
}

case object Pink extends Colour {

  val red = 255

  val green = 192

  val blue = 203

  val name = "Pink"

}

case class  NewColour(red: Int, green: Int, blue: Int) extends Colour{

  val name = null

}


//testing colour luminance
object TestColour extends App{

  val red: Colour = Red

  val yellow: Colour = Yellow

  val pink: Colour = Pink

  val black: Colour = NewColour(0,0,0)

  val white: Colour = NewColour(255,255,255)

  black.darkColour is true

  white.darkColour is false

}
