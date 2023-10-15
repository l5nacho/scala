//Quick Check 38.2 Implement a method called sqrtOrZero that takes an integer. It
//uses the function sqrt that you implemented in Quick Check 38.1 to compute the
//square root of the number. Use pattern matching to return zero when the operation
//is not supported.


def sqrt(n: Int): Either[String, Double] =
  if (n < 0) Left("Operation not supported for negative numbers")
  else Right(Math.sqrt(n))

def sqrtOrZero(n: Int): Double =
  sqrt(n) match {
    case Left(_) => 0
    case Right(d) => d
  }