package Planet

import com.atomicscala.AtomicTest._

class Planet (val name: String, val description: String, val moons: Int = 1 ){

  def hasMoon: Boolean = moons > 0

}

object PlanetTest extends App{

  val p = new Planet(name = "Mercury",
    description = "small and hot planet", moons = 0)

  p.hasMoon is false

  val earth = new Planet(moons = 1, name = "Earth",
    description = "a hospitable planet")

  earth.hasMoon is true
}
