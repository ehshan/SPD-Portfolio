package ClothesWasher

import com.atomicscala.AtomicTest._

//default constructor with no set values
class ClothesWasher(val modelName: String, val capacity: Double) {

  //constructor with set capacity
  def this(modelName: String) {
    this(modelName, 1.1)
  }

  //constructor with set model name
  def this(capacity: Double) {
    this("Wash'n'Go", capacity)
  }
}

//empty named defaults
class ClothesWasher2(val modelName: String = "", val capacity: Double = 0)


object TestClothesWasher extends App {

  //testing default constructor
  val noDefaults = new ClothesWasher("WA5H3R", 2.5)
  noDefaults.modelName is "WA5H3R"
  noDefaults.capacity is 2.5

  //testing constructor with empty named defaults
  val setDefaults = new ClothesWasher2("WA5H3R", 2.5)
  setDefaults.modelName is "WA5H3R"
  setDefaults.capacity is 2.5

  //testing auxiliary constructor
  val modelSet = new ClothesWasher(4.5)
  modelSet .modelName is "Wash'n'Go"
  modelSet .capacity is 4.5

  //testing auxiliary constructor
  val nameSet = new ClothesWasher("Coldpoint")
  nameSet.modelName is "Coldpoint"
  nameSet.capacity is 1.1

}
