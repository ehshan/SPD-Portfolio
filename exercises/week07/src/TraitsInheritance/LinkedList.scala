package TraitsInheritance

import com.atomicscala.AtomicTest._


sealed trait LinkedList[A] {

  def length: Int = this match{

    case Pair(head, tail) => 1 + tail.length

    case Empty() => 0

  }


  def apply(index: Int): A = this match{

    case Pair(head, tail) =>  if (index == 0) head else tail(index - 1)

    case Empty() => throw new Exception("Bad things happened")

  }


  def contains(item: A): Boolean = this match {

    case Pair(head, tail) => if (head == item) true  else tail.contains(item)

    case Empty() => false

  }
}

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]

final case class Empty[A]() extends LinkedList[A]


object Main extends App{

  val list = Pair(1, Pair(2, Pair(3, Empty())))

  //testing that list is an instance of a linked list
  list.isInstanceOf[LinkedList[Int]] is true

  list.head is 1
//  list.tail.head is 2
//  list.tail.tail is Pair(3, Empty())  // not working

  //testing length
  list.length is 3

  //testing apply
  list(0) is 1
  list(1) is 2
  list(2) is 3

  //testing contains
  list.contains(1) is true
  list.contains (0) is false
}