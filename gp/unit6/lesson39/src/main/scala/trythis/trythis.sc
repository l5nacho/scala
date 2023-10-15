//TRY THIS Implement a function that takes either a string or an integer and
//returns true if the given text is “Scala,” false otherwise.

def isScala(str: Either[String, Int]): Boolean =
  str.left.exists(_ == "Scala")