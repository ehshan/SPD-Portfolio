package Generics

sealed trait IntList

final case object End extends IntList

final case class Pair(head: Int, tail: IntList) extends IntList

