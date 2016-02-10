package Strategy.Scala

class CapTextFormatter extends TextFormatter {
  def format(text: String) {

    println("[CapTextFormatter]: "+text.toUpperCase)
//    throw new UnsupportedOperationException
  }
}