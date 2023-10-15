import scala.util.Try
//Quick Check 40.7 The class String offers a method called toBoolean to convert
//text into a Boolean value, which is unsafe because it throws an exception for any
//string that does not match true or false. Implement a function called toSafeBoolean
//by reusing toBoolean and returning false rather than throwing an exception.


def toSafeBoolean(text: String): Boolean =
  Try(text.toBoolean).getOrElse(false)
  