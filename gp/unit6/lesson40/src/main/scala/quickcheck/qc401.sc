//Quick Check 40.1 Implement a function called toTry that converts an instance of
//Either[Throwable, T] into one of type Try[T] .

import com.sun.net.httpserver.Authenticator.Failure

import scala.util.{Failure, Success, Try}

def toTry[T](either: Either[Throwable, T]): Try[T] =
  either match {
    case Left(ex) => Failure(ex)
    case Right(t) => Success(t)
  }
