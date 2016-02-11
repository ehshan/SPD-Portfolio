package AbstractFactory.Scala

class LondonErrorXMLParser extends XMLParser {
  def parse: String = {
    println("London Parsing error XML...")
    "London Error XML Message"
  }
}