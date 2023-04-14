import scala.io.StdIn.readLine

object main {
	def main(args : Array[String]) : Unit = {
	
	var age : String = readLine("Wellcome to Playland, please tell me your age\n") 
	var age_num = age.toInt
	
	if (age_num > 13) {
		var sp_card = readLine("Would you like a special pass?\n")
		
		if (sp_card == "yes") {
			println("Wellcome to playground, here you have a special card")
			}
			
		else {
			println("Wellcome to playground, next time we hope you get a special card")
			}
		}
	
	else {
		println("Sorry, you are not allowed to enter in playground")
		}
	}
	
}