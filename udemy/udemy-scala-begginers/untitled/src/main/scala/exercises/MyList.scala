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

  def map[B](transformer: MyTransformer[A, B]): MyList[B]
  def flatMap[B](transformer: MyTransformer[A, MyList[B]]): MyList[B]
  def filter(predicate: MyPredicate[A]): MyList[A]

  def ++[B >: A](list: MyList[B]): MyList[B]

}

object Empty extends MyList[Nothing] {
  override def head: Nothing = throw new NoSuchElementException
  override def tail: MyList[Nothing] = throw new NoSuchElementException
  override def isEmpty: Boolean = true
  override def add[B >: Nothing] (n: B): MyList[B] = new Cons(n, Empty)
  override def printElements: String = ""

  override def map[B](transformer: MyTransformer[Nothing, B]): MyList[B] = Empty
  override def flatMap[B](transformer: MyTransformer[Nothing, MyList[B]]): MyList[B] = Empty
  override def filter(predicate: MyPredicate[Nothing]): MyList[Nothing] = Empty

  override def ++[B >: Nothing](list: MyList[B]): MyList[B] = list
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

  override def map[B](transformer: MyTransformer[A, B]): MyList[B] =
    new Cons(transformer.transform(h), t.map(transformer))
  override def flatMap[B](transformer: MyTransformer[A, MyList[B]]): MyList[B] =
    transformer.transform(h) ++ t.flatMap(transformer)
  override def filter(predicate: MyPredicate[A]): MyList[A] =
    if (predicate.test(h)) new Cons(h, t.filter(predicate))
    else t.filter(predicate)

  override def ++[B >: A](list: MyList[B]): MyList[B] =
    new Cons(h, t ++ list)

}

trait MyPredicate[-T] {
  def test(elem: T): Boolean
}

trait MyTransformer[-A, B] {
  def transform(elem: A): B
  }


/*
* 1. Generic trait Mypredicate[-T] Method test => Boolean
* 2. Generic trait MyTransformer[-A, B] Method transform(A) => B
* 3. MyList:
*     - map(transformer) => MyList
*     - filter(predicate) => MyList
*     -flatMap(tranformer from A to MyList[B] => MyList[B]
* */

object ListTest extends App {
  val listOfIntegers = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(listOfIntegers.toString)
  val listOfStrings = new Cons("Hello", new Cons("Scala", new Cons("test", Empty)))
  println(listOfStrings.toString)

  println(listOfIntegers.map(new MyTransformer[Int, Int] {
    override def transform(elem: Int): Int =
      elem * 2
  }))

  println(listOfIntegers.filter(new MyPredicate[Int] {
    override def test(elem: Int): Boolean =
      elem % 2 == 0
  }))
}