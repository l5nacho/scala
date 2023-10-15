package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Nacho", 40)
  println(person.age)
  person.greet("Daniel")

  val autor = new Writer("Joe", "Abercrombie", 1965)

  println(autor.fullName())

  val novel1 = new Novel("Before they hung them", 2010, autor)
  println(novel1.authorAge())
  println(novel1.isWrittenBy())

  val novel1V2 = novel1.copy(2023)
  println(novel1V2.authorAge())

  val counter = new Counter
  counter.increment.increment.increment.print
  counter.increment(5).print


}

// Constructor
class Person(name: String, val age: Int) {
  // Body
  val x = 2
  println(1 + 3)

  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am ${this.name}")

  // Multiple constructors
  def this(name: String) = this(name, 0)

  def this() = this("John Doe")
}

// class parameters are NOT FIELDS

/*
* Novel and Writer
*
* Writer: first name, surname, year
*   method fullname
*
* Novel: name, year of release, author
* - authorAge
  - isWrittenBy(author)
  - copy (new year of release) = new instance of Novel
* */

class Writer(firstName: String, surname: String, val year: Int) {

  def fullName(): String = firstName + " " + surname

}

class Novel(name: String, yearOfRelease: Int, author: Writer) {

  def authorAge(): Int = yearOfRelease - author.year

  def isWrittenBy(): String = author.fullName()

  def copy(newYearRelease: Int): Novel = new Novel(name, newYearRelease, author)

}

/*
* Counter class
*   - receives an int value
*   - method current count
*   - method to increment/decrement => new counter
*   - overload inc/dec to receive an amount
* */

class Counter(count: Int = 0) {
  def currentCount(): Int = count

  def increment: Counter = {
    println("Incrementing")
    new Counter(count + 1)
  }

  def decrement: Counter = {
    println("Decrementing")
    new Counter(count - 1)
  }

  def increment(qty: Int): Counter = {
    if (qty <= 0) this
    else increment.increment(qty - 1)
  }

  def decrement(qty: Int): Counter = {
    if (qty <= 0) this
    else decrement.decrement(qty - 1)
  }

  def print = println(count)

}