//Quick Check 39.1 Implement a function called getOrZero that takes a value of type
//Either[String, Double] as its parameter. It returns the value wrapped in its right
//  projection or zero.

def getOrZero(value: Either[String, Double]): Double =
  value.getOrElse(0)