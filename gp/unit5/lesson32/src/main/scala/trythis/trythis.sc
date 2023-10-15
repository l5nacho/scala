//TRY THIS Imagine you are building a program to mark exams. Assume that a
//mark has an exam name, a score, and a student ID. Write a function that takes
//a sequence of marks and prints a human-readable message to the console con-
//taining the top five scores’ student ID

case class Mark(name: String, score:Int, studentId: Int)

def topFiveScores(marks: List[Mark]): Unit = {
  val topFive = marks.sortBy(e => e.score).take(5)
  val scores = topFive.map(_.studentId)
  val text = s"The top 5 students are ${scores.mkString(", ")}"
  println(text)
}