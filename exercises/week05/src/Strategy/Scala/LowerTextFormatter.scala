package Strategy.Scala

class LowerTextFormatter extends TextFormatter {
  def format(text: String) {

    println("[CapTextFormatter]: "+text.toLowerCase)
//    throw new UnsupportedOperationException
  }
}