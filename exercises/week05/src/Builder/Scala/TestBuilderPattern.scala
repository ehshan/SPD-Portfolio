package Builder.Scala

object TestBuilderPattern {
  def main(args: Array[String]) {

    //car builder object with sedan blueprint
    var carBuilder: CarBuilder = new SedanCarBuilder

    //director with car blueprint (including sedan specs)
    var director: CarDirector = new CarDirector(carBuilder)

    //building with passes specs
    director.build

    //checking car
    var car: Car = carBuilder.getCar
    System.out.println(car)

    //as above
    carBuilder = new SportsCarBuilder
    director = new CarDirector(carBuilder)
    director.build
    car = carBuilder.getCar
    System.out.println(car)
  }
}