import scala.io.StdIn.readLine

object main {
	
	def main(args : Array[String]) : Unit = {
	
		var age : String = readLine("Introduce tu edad: \n");
		
		var age_int : Int = age.toInt;
		
		if (age_int > 13) {
			println("Puedes entrar");
		}
		
		else {
			println("Lo siento solo los mayores de 13 años pueden entrar\n");
		}
	
	}
}