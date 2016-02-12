package Forecast

import com.atomicscala.AtomicTest._

object Forecast extends App {


  def forecast(temp: Int): String =
    temp match{
      case 100 => "Sunny"
      case 80 => "Mostly Sunny"
      case 50 => "Partly Sunny"
      case 20 => "Mostly Sunny"
      case 0 => "Cloudy"
      case any => "Unknown"
    }

    forecast(100) is "Sunny"
    forecast(80) is "Mostly Sunny"
    forecast(50) is "Partly Sunny"
    forecast(20) is "Mostly Sunny"
    forecast(0) is "Cloudy"
    forecast(15) is "Unknown"

  val sunnyData = Vector(100, 80, 50, 20, 0, 15)

  for (s <- sunnyData) {
    println(forecast(s))
  }

}


