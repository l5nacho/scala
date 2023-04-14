import scala.io.StdIn.readLine

object main {
	def main(args : Array[String]) : Unit = {
		
		var x : String = readLine("Introduce el primer numero:");
		var y : String = readLine("Introduce el segundo numero:");
		
		var num1 : Int = x.toInt;
		var num2 : Int = y.toInt;
		
		if (num1 > num2) {
			println("El número " + num1 + " es mayor que el numero " + num2);
		}
		
		else {
			println("El numero " + num2 + " es mayor que el numero " + num1);
		}
	}
}