package lectures.part2oop

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  // 1. Class parameters are fields
  val jim = new Person("jim", 34)
  println(jim.name)

  // 2. sensible toString
  // println(instance) = println(instance.toString) // Syntactic sugar
  println(jim.toString)

  // 3. Equals and hashcode implemented OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  // 4. CCs have handy copy methods
  val jim3 = jim.copy(age = 45)
  println(jim3)

  // 5. CCs have companion objects
  val thePerson = Person
  val mary = Person("mary", 23) // Factory method

  // 6. CCs are serializable
  // Akka

  // 7. CCs have extractor patterns == CCs can be used in PATTERN MATCHING

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }

}
