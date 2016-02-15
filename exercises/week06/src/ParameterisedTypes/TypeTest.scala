package ParameterisedTypes


import com.atomicscala.AtomicTest._


object TypeTest extends App {

  // Return type is inferred:
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }

  // Explicit return type:
  def explicit(c1: Char, c2: Char, c3: Char): Vector[Char] = {
    Vector(c1, c2, c3)
  }

  //testing inferred and explicit methods
  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  explicit('a', 'b', 'c') is "Vector(a, b, c)"


  //explicit method modified to return a vector of doubles instead of chars
  def explicitDouble(d1: Double, d2: Double, d3: Double): Vector[Double] = {
    Vector(d1, d2, d3)
  }

  //checking for vector of doubles
  explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)


  //explicit method modified to take a vector of doubles and return as list
  def explicitList(v1: Vector[Double]): List[Double] = {
    v1.toList
  }

  //checking list object returned
  explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
  explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)


  //explicit method modified to take a vector of doubles and return as set
  def explicitSet(v1: Vector[Double]): Set[Double] = {
    v1.toSet
  }

  //checking set object returned
  explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
  explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)

}