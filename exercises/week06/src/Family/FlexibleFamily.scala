package Family

import com.atomicscala.AtomicTest._

class FlexibleFamily(mum: String, dad: String, children: String*) {

  def familySize(): Int ={
    var count = 2
    for (c <- children){
      count += 1
    }
    count
  }

}

object FlexiFamilyTest extends App{

  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
  family3.familySize() is 4

  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
  family4.familySize() is 3

}
