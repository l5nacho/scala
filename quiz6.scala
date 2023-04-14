import scala.io.StdIn.readLine

object main {
	
	def main(args : Array[String]) : Unit = {
	
		val age : String = readLine("Introduce your age:\n")
		val height : String = readLine("Introduce your height:\n")
		
		val age_int : Int = age.toInt
		val height_int : Int = height.toInt
		
		if ( age_int > 13 && height_int > 5 ) {
			println("Wellcome to playland, you are allowed to enter")
		}
		
		else {
			
			if (age_int > 13) {
				println("Sorry, your height doesnt allow you to enter to Playland")
			}
			else {
				println("Sorry, your age doesnt allow you to enter to Playland")
			}
		}
	
	}
	
}