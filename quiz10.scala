import scala.io.StdIn.readLine

object main{

	def main(args : Array[String]) : Unit = {
	
		var x : String = readLine("How many courses did you get:\n");
		var num_courses : Int = x.toInt;
		
		var grades : Int = 0;
		println("You took a total of " + num_courses + " courses")
		
		for (y <- 1 to num_courses) {
			var z = readLine("Enter the grade for course " + y + ":\n");
			var grade : Int = z.toInt;
			
			grades = grades + grade; 
		}
		
		var avg : Float = grades / num_courses
		
		println("The average of your grades is " + avg)
		
		if (avg >= 90) {println("Congratulations your grade is A")}
		else if (avg >= 70) {println("Congratulations your grade is B")}
		else if (avg >= 60) {println("Very good! your grade is C")}
		else if (avg >= 50) {println("Your grade is D")}
		else {println("Too bad, your grade is F")}
	
	
	}

}