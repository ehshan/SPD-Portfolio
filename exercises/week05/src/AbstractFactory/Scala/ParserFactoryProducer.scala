package AbstractFactory.Scala

object ParserFactoryProducer {
  def getFactory(factoryType: String): AbstractParserFactory = {
    factoryType match {
      case "NYCFactory" =>
        new NYCParserFactory
      case "LondonFactory" =>
        new LondonParserFactory
    }
  }
}
