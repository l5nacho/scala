package lectures.part2oop

object Inheritance extends App {

  // single class inheritance
  class Animal {
    val creatureType = "wild"
    //protected def eat = println("ñamñam")
    def eat = println("ñamñam")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  // cat.eat solo funciona sin modificador, si añadimos private or protected no funciona
  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
    // si definimos un constructor auxiliar no hace falta extender todos los parametros
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
//    override val creatureType: String = "domestic"
    override def eat: Unit = {
      super.eat
      println("crunch crunch")
    }
  }

//  class Dog(dogType: String) extends Animal {
//    override val creatureType: String = dogType
//    override def eat = println("crunch crunch")
//  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)

  // Type substitution (broad: Polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // Super

  // preventing overrides
  // 1 - use final on member => final def eat = println("ñamñam")
  // 2 - use final on the entire class => final class Animal (evita que se pueda heredar de la clase)
  // 3 - seal the class = Extend classes in THIS file but prevent extension in OTHER files



}
