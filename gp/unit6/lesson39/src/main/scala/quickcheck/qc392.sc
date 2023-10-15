//Quick Check 39.2 Implement a function called isPositive that takes a value of type
//Either[String, Double] and returns true if it contains a double bigger than zero,
//false otherwise.

def isPositive(value: Either[String, Double]): Boolean =
  value.exists(x => x > 0)