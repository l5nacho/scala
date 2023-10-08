package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  //println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2. Factorial function
    3. A Fibonacci function
    4. Tests if a number is prime
  * */

  def greeting(name: String, age: Int): String = "Hi, my name is $name and I am $age years old."

  println(greeting("nacho", 40))

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n-1)
  }

  println(factorial(5))

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else {
      println("Numero fibonacci " + (n - 1) + " y numero fibonacci " + (n-2))
      val result = fibonacci(n - 1) + fibonacci(n - 2)
      println("calculando fibonacci de " + n)

      result
    }
  }

  println(fibonacci(5))

  def isPrime(n: Int): Boolean =
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)

  println(isPrime(7))
  println(isPrime(15))
  println(isPrime(17))
  println(isPrime(21))
}
