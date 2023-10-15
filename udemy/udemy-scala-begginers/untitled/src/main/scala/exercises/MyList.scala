package exercises

abstract class MyList[+A] {

  /*
  * head = first element of the list
  * tail = remainder of the list
  * isempty = is this list empty
  * add(int) => new list with this element added
  * toString => a string representation of the list
  * */

  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B >: A](n: B): MyList[B]
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList[Nothing] {
  override def head: Nothing = throw new NoSuchElementException
  override def tail: MyList[Nothing] = throw new NoSuchElementException
  override def isEmpty: Boolean = true
  override def add[B >: Nothing] (n: B): MyList[B] = new Cons(n, Empty)
  override def printElements: String = ""
}

class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {
  override def head: A = h
  override def tail: MyList[A] = t
  override def isEmpty: Boolean = false
  override def add[B >: A](n: B): MyList[B] = new Cons(n, this)
  override def printElements: String = {
    if (t.isEmpty) "" + h
    else s"$h -> ${t.printElements}"
  }

}

object ListTest extends App {
  val listOfIntegers = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(listOfIntegers.toString)
  val listOfStrings = new Cons("Hello", new Cons("Scala", new Cons("test", Empty)))
  println(listOfStrings.toString)
}