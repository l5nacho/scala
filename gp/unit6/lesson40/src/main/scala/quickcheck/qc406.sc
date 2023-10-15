//Quick Check 40.6 Rewrite the function findStudent(id: String) that you imple-
//  mented in Quick Check 40.5 using for-comprehension .

import scala.util.Try

case class Student(id: Int, name: String, topics: Set[String])
def findStudent(id: Int): Try[Student] = ???

def findStudent(id: String): Try[Student] =
  for {
    idInt <- Try(id.toInt)
    student <- findStudent(idInt)
  } yield student