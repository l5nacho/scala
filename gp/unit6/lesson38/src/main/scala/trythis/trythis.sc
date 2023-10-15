//TRY THIS In Quick Check 38.4, you saw that the given implementation of the
//  function validation doesn’t behave as expected when you need to accumulate
//errors. Change its return type to Either[List[String], Int] and its implemen-
//  tation to address this issue. HINT: Use pattern matching.


def validation(a: Either[String, Int],
               b: Either[String, Int]): Either[List[String], Int] =
  (a, b) match {
    case (Right(aa), Right(bb)) => Right(aa + bb)
    case (Left(errA), Left(errB)) => Left(List(errA, errB))
    case (Left(err), _) => Left(List(err))
    case (_, Left(err)) => Left(List(err))
  }