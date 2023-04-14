import scala.io.StdIn.readLine

object main {

	def main(args : Array[String]) : Unit = {
	
	var x : String = readLine("Enter your grade: \n");
	
	var grade : Int = x.toInt;
	
	if (grade >= 90) {println("Congratulations your grade is A")}
	else if (grade >= 70) {println("Congratulations your grade is B")}
	else if (grade >= 60) {println("Very good! your grade is C")}
	else if (grade >= 50) {println("Your grade is D")}
	else {println("Too bad, your grade is F")}
	
	}

}