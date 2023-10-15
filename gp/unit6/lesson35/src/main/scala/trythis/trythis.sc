//TRY THIS Implement a function that takes a group of students and a set of
//topics as its parameters. It returns a new set containing the students who are
//taking any of the given topics. Use the student representation you used in this
//lesson:

case class Student(id: Int, name: String, topics: Set[String])

def studentsByTopic(students: Set[Student], topics: Set[String]): Set[Student] =
  students.filter { student =>
  val matchingTopics = student.topics intersect topics
  matchingTopics.nonEmpty
}