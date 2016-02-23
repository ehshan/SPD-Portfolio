package TraitsInheritance

import com.atomicscala.AtomicTest._

sealed trait DivisionResult

case class Finite(num: Int) extends DivisionResult

case class Infinite() extends DivisionResult


object Divide {

  def apply(num1: Int, num2: Int) : DivisionResult = num2 match {

    case 0 => Infinite()
    case _ => Finite(num1/num2)

  }

}

object DivideTest extends App {

  def eval(num1: Int, num2: Int ): String =  Divide(num1,num2) match{

    case Infinite() => "The result is Infinite"
    case Finite(_) => "The result is Finite("+num1/num2+")"

  }

  //  def eval (num1: Int, num2: Int) : String ={
  //    if (Divide(num1, num2).equals(Infinite)) "The result is Infinite" else "The result is Finite("+num1/num2+")"
  //  }

  eval(10,3) is "The result is Finite(3)"
  eval(3,10) is "The result is Finite(0)"
  eval(1,0) is "The result is Infinite"
}
