//Quick Check 40.2 Implement a function called toEither that converts an instance
//  of type Try[T] into one of type Either[Throwable, T] .

import scala.util.{Try, Failure, Success}

def toEither[T](tryT: Try[T]): Either[Throwable, T] =
  tryT match {
    case Failure(ex) => Left(ex)
    case Success(s) => Right(s)
  }