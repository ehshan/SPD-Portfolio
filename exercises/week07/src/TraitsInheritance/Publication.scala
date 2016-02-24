package TraitsInheritance


sealed trait Publication

sealed trait Book extends Publication {val author: Author}

case class Periodical(editor: Editor, volume: Seq[Volume]) extends Publication

case class Volume(volumeNo: Int, volumes: Seq[Issue])

case class Issue(volumeNo: Int, issueNo: Int, manuscripts: Seq[Manuscript])

case class Manuscript(override val author: Author, length: Int) extends Book

case class Author()

case class Editor()

