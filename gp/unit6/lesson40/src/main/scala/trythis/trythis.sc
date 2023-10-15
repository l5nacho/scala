import scala.util.Try
//TRY THIS Imagine you are developing software to read and manipulate data
//  from a file. Implement a function to parse a string into an instance of Person :

case class Person(age: Int, name: String)

def parser(str: String): Try[Person] = Try {
  val List(age, name) = str.split(",", 2).toList
  Person(age.toInt, name)
}