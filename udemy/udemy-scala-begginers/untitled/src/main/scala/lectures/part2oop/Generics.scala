package lectures.part2oop

object Generics extends App{

  class MyList[A] {
    // use the type A
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfString = new MyList[String]

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  // Variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. YES, List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog)???? HARD QUESTION

  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal] // NO se puede poner Cat

  // 3. HELL, NO! CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // Bounded types
  class Cage[A <: Animal] (Animal: A) // Solo acepta subclases de Animal
  val cage = new Cage(new Dog)

}
