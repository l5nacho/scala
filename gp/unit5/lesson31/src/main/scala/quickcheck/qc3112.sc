//Quick Check 31.2 Implement a function that, given a list of double, returns a new
//sequence containing only its nonnegative numbers:

def filterNonNegative(numbers: List[Double]): List[Double] =
  numbers.filter(_>0)