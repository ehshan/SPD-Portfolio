package AbstractFactory.Scala

trait AbstractParserFactory {
  def getParserInstance(parserType: String): XMLParser
}