//Quick Check 40.5 Imagine you implemented a function to find a student by an ID:
//import scala.util._
//case class Student(id: Int, name: String, topics: Set[String])
//def findStudent(id: Int): Try[Student] = ???
//Implement another function with the same name that takes a string as its parame-
//  ter and returns an instance of Try[Student] by reusing the existing findStudent(id:
//  Int) function.
//def findStudent(id: String): Try[Student]
//HINT: You can parse a string instance into an integer using the toInt function, which
//throws an exception if this is not possible.

import scala.util._
case class Student(id: Int, name: String, topics: Set[String])
def findStudent(id: Int): Try[Student] = ???

def findStudent(id: String): Try[Student] =
  try(id.toInt).flatMap(findStudent)