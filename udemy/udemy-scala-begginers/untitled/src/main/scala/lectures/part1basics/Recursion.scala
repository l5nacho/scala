package lectures.part1basics

import lectures.part1basics.ValuesVariablesTypes.aString

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App{

  def factorial(n: Int): Int =
    if (n<= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
      }

//  println(factorial(5000))

  def anotherFactorial(n: Int): BigInt =
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = Use recursive call as de LAST expression

    factHelper(n, 1)

  println(anotherFactorial(5000))

  /*
  1. Concatenate a string n times
  2. isPrime with tailrec
  3. Fibonacci function, tail recursive
  */

  def stringConcatTailRec(s: String, n: Int): String =
    @tailrec
    def stringHelper(s: String, x: Int, accumulator: Int ): String =
      if (x <= 1) s * accumulator
      else stringHelper(s, x - 1, 1 + accumulator)

    stringHelper(s, n, 1)

//  println(stringConcatTailRec("hola", 10000))


  def stringConcat(s: String, n: Int): String =
    @tailrec
    def loop(s: String, n: Int, accumulator: String): String =
      if (n == 0) accumulator
      else loop(s, n - 1, s + accumulator)

    loop(s, n, "")

  println(stringConcat("hola", 20))

//  def isPrimeTailRec(n: Int): Boolean =
//    def isPrimeUntil(t: Int, accumulator: Boolean): Boolean =
//      if (t <= 1) true
//      else n % t != 0 && isPrimeUntil(t - 1)
//
//    isPrimeUntil(n / 2)
//
//  println(isPrimeTailRec(20))
//
  def fiboTailRec(n: Int): Int =
    @tailrec
    def loop(n: Int, prev: Int, cur: Int): Int =
      if (n <= 2) prev
      else loop(n - 1, prev + cur, prev)

    loop(n, 0, 1)


  println(fiboTailRec(1000))
}
