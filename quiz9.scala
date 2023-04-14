import scala.io.StdIn.readLine

object main {

	def main(args: Array[String]) : Unit = {
	
		var cierre : String = "";
		var factorial : Int = 1;
		
		while(cierre != "exit") {
			var x =  readLine("Enter a number: \n").toInt;
			for (y <- 1 to x) {
				
				//println(y)
				factorial = factorial * y;
				//println(x);
				println(factorial);
			}
			
			cierre = readLine("Quieres salir? Teclea exit\n")
		}

	}
}
