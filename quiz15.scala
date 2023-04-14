import scala.io.StdIn.readLine

object main {

	def main(args : Array[String]) : Unit = {
	
		val sum = (a: Int, b: Int) => (a+b);
		val mul = (a:Int, b: Int) => (a*b);
		val div = (a: Int, b: Int) => (a/b);
		val sub = (a: Int, b: Int) => (a-b);
		
		val a : Int = readLine("Introduce el valor a: ").toInt; 
		val b : Int = readLine("Introduce el valor b: ").toInt;
		val c : Int = readLine("Introduce el valor c: ").toInt;
		
		var algo : Int = mul(div(sum(a,b),c), a);
		
		println(algo);
	
	}

}