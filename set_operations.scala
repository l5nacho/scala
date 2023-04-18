import scala.collection.mutable

object main {

  def main(args: Array[String]): Unit = {

    var s1 = Set(1,2,3,4,5);
    var s2 = Set(1,2,3);

    var unionSet = s1.union(s2);
    println("Operacion UNION -> " + unionSet);

    var intersectSet = s1.intersect(s2);
    println("operacion INTERSECT -> " + intersectSet);

    var diffSet = s1.diff(s2);
    println("operacion DIFF -> " + diffSet)
  }
}
