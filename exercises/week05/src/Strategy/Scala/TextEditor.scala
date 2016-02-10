package Strategy.Scala

class TextEditor {

  var formatter: TextFormatter = _

  def this(textFormatter: TextFormatter) {
    this()
    this.formatter = textFormatter

//    throw new UnsupportedOperationException
  }


  def publishText(text: String) {

    formatter.format(text)
//    throw new UnsupportedOperationException
  }

}