package fpinscala.answers.gettingstarted

import scala.annotation.tailrec

// A comment!
/* Another comment */
/** A documentation comment */
object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  private def formatAbs(x: Int): String = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  @main
  def printAbs: Unit =
    println(formatAbs(-42))

  def factorial(n: Int): Int =
    @tailrec
    def loop(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else loop(n - 1, n * acc)

    loop(n, 1)

  @main
  def testFactorial: Unit =
    println(factorial(120))

  /*
  Write a recursive function to get the nth Fibonacci number (http://mng.bz/C29s).
  The first two Fibonacci numbers are 0 and 1 . The nth number is always the sum of the
  previous two—the sequence begins 0, 1, 1, 2, 3, 5 . Your definition should use a
  local tail-recursive function.
  */

  def fib(n: Int): Int = {
    @tailrec
    def loop(n: Int, current: Int, previous: Int): Int =
      if (n <= 2) current
      else loop(n - 1, current + previous, current)

    loop(n, 1, 0)
  }

  @main
  def testFibonacci: Unit =
    println(fib(8))

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  @main
  def absFactorialTest: Unit =
    println(formatAbs(-42))
    println(formatFactorial(7))

  def formatResult(name: String, n: Int, f: Int => Int): String = {
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))
  }

  @main
  def formatResultTest(): Unit = {
    println(formatResult("Absolute value", -42, abs))
    println(formatResult("factorial", 7, factorial))
  }
}

object PolimorphicFunctions {

  // MONOMORPHIC function to find a string in an Array

  def findFirstString(ss: Array[String], key: String): Int = {
    @tailrec
    def loop(n: Int): Int =
      if (n >= ss.length) -1

      else if (ss(n) == key) n
      else loop(n+1)

    loop(0)
  }

  @main
  def testfindFirstString: Unit =
    val arr = Array("hola", "como", "estas")
    println(findFirstString(arr, "nacho"))
    println(findFirstString(arr, "como"))
    println(findFirstString(arr, "Estas"))
    println(findFirstString(arr, "estas"))

  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    def loop(n: Int): Int =
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n+1)

    loop(0)
  }

  /*
  Exercise 2.2
  Implement isSorted , which checks whether an Array[A] is sorted according to a
  given comparison function:
  */

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    def loop(n: Int): Boolean =
      if (n >= as.length - 1) true
      else if (ordered(as(n), as(n + 1))) false
      else loop(n+1)

    loop(0)
  }

  @main
  def testFindFirst: Unit =

    println(findFirst(Array(1, 2, 3, 4, 9), (x: Int) => x == 2))
    println(findFirst(Array(7, 9, 13), (x: Int) => x == 9))
    println(findFirst(Array("hola", "como", "estas"), (x: String) => x == "hola"))

  @main
  def testIsOrdered: Unit =
    println(isSorted(Array(1, 2, 3, 4, 9), (x: Int, y: Int) => x > y))
    println(isSorted(Array(1, 2, 3, 10, 9), (x: Int, y: Int) => x > y))
    println(isSorted(Array("hola", "como", "estas"), (x: String, y: String) => x > y))
    println(isSorted(Array("a", "b", "c"), (x: String, y: String) => x > y))
}
