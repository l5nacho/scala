import scala.io.StdIn.readLine

object main {
	def main(args : Array[String]) : Unit ={
		//var s1 : String = "123";
		//println(string);
		//println(string.getClass.getName);
		//var s2 = string.toInt;
		//println(int.getClass.getName)
		
		var x = readLine("Introduce un numero...")
		
		println("El numero elegido es: ")
		println(x)
		println("de tipo: ")
		println(x.getClass.getName)
		var y = x.toInt
		println("Tipo cambiado a int:")
		println(y.getClass.getName)
		var z = y.asInstanceOf[Float]
		println("Ahora cambiamos a float: ")
		println(z.getClass.getName)
		
	}
}