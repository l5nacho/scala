import scala.io.StdIn.readLine

object main{

	def main(args : Array[String]) : Unit = {
		
		var num = take_input();
		var fact = calculate_factorial(num);
		show_result(num, fact);
	
	}
	
	def take_input() : Int = {
	
		var number = readLine("Introduce un numero: ").toInt;
		//number = number;
		
		return number
	}
	
	def calculate_factorial(number : Int) : Int = {
		
		var factorial = 1;
		
		for (x <- 1 to number) {
			
			factorial = factorial * x;
		}
		return factorial
	}
	
	def show_result(num : Int, fact : Int) : Unit = {
		
		println("El numero " + num + " tiene el factorial " + fact)
	
	}

}