// Methods inside Classes
// Q1
class Sailboat {
  def raise() = {
    println("Sails raised")
  }
  def lower() = {
    println("Sails lowered")
  }

  def signal() = {
    val flare = new Flare
    flare.light()
  }
}

class Motorboat {

  def on() = {
    "Motor on"
  }
  def off() = {
    "Motor off"
  }

  def signal() = {
    val flare = new Flare
    flare.light()
  }
}
// Testing raising sails
val sailboat = new Sailboat
val r1 = sailboat.raise()
assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
val r2 = sailboat.lower()
assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)

// raise/lower methods returns no value -> hence comparing unrelated types

// Testing turning motorboat on/off
val motorboat = new Motorboat
val s1 = motorboat.on()
assert(s1 == "Motor on", "Expected Motor on, Got " + s1)
val s2 = motorboat.off()
assert(s2 == "Motor off", "Expected Motor off, Got " + s2)

// methods correctly return a string

// Q2
class Flare {
  def light() = {
    "Flare used!"
  }
}
// Testing light method
val flare = new Flare

val f1 = flare.light()
assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)

//correctly returns a string


// Q3
val sailboat2 = new Sailboat

val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)

val motorboat2 = new Motorboat

val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used! Got " + signal)

//All good