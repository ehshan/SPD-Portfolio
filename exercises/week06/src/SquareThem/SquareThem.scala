package SquareThem

import com.atomicscala.AtomicTest._


object SquareThem extends App {

  def squareThem(nums :Int*):Int ={
    var squared = 0
    for (n <- nums){
      squared += n * n
    }
    squared
  }

  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21
}
