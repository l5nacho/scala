//Quick Check 40.4 Implement a function called superFlatten that takes an instance
//  of Try[Try[Try[T]]] and returns one of type Try[T] .

import scala.util.Try

def superFlatten[T](tryT: Try[Try[Try[T]]]): Try[T] = tryT.flatten.flatten