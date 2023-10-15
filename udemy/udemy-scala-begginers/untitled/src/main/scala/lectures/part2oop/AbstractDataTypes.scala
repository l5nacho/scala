package lectures.part2oop

object AbstractDataTypes extends App{

  // abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit = println("crunch crunch")
  }

  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }
  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    override def eat: Unit = "nomnomnom"
    override def eat(animal: Animal): Unit = println(s"I am a croc and Im eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  println(croc eat dog)

  // Abstract vs traits
  // 1 - traits do not have constructor parameters
  // 2 - multiple traits may be inherited by the same class
  // 3 - traits = behaviour, abstract class = "thing"
}
