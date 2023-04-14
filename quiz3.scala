import scala.io.StdIn.readLine

object main {
	def main(args : Array[String]) : Unit = {
		
		var x : String = readLine("Introduce el primer numero:")
		var y : String = readLine("Introduce el segundo numero:")
		
		var suma : Int = x.toInt + y.toInt
		var multiplicacion : Int = x.toInt * y.toInt
		
		println("El primer numero es " + x + "El segundo numero es " + y)
		println("La suma es " + suma + " y la multiplicacion es " + multiplicacion)
	}
}