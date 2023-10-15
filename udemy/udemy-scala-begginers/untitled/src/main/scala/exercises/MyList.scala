package exercises

abstract class MyList {

  /*
  * head = first element of the list
  * tail = remainder of the list
  * isempty = is this list empty
  * add(int) => new list with this element added
  * toString => a string representation of the list
  * */

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(n: Int): MyList
  def printElements: String
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList {
  override def head: Int = -1
  override def tail: MyList = null
  override def isEmpty: Boolean = true
  override def add(n: Int): MyList = new Cons(n, Empty)
  override def printElements: String = ""
}

class Cons(h: Int, t: MyList) extends MyList {
  override def head: Int = h
  override def tail: MyList = t
  override def isEmpty: Boolean = false
  override def add(n: Int): MyList = new Cons(n, this)
  override def printElements: String = {
    if (t.isEmpty) "" + h
    else h + " -> " + t.printElements
  }

}

object ListTest extends App {
  val lista = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(lista.tail.tail.head)
  val lista2 = lista.add(0)
  println(lista2.head)
  println(lista2.toString)
}