import scala.io.StdIn.readLine
import scala.util.control.Breaks._

object main {
	
	def main(args : Array[String]) : Unit = {
	
		println("-------------------------------------------------");
		println("Wellcome to the Fortune Game\n\nYou've got 5 tries to guess the number\n");
		println("Each time you will get a clue\n\nGOOD LUCK!!");
		println("-------------------------------------------------");
		
		var gameStatus : String = "lost"
	
		val rnd = scala.util.Random;
		val rnd_num = rnd.nextInt(100);
		println(rnd_num);
		
		breakable{
			for (x <- 1 to 5){
			
				var z = readLine("Please enter your guess: ");
				var guess = z.toInt;
				
				if (guess < rnd_num) {
					println("The number is higher than your guess");
					println(x);
					}
				else if (guess > rnd_num) {
					println("The number is lower than your guess");
					println(x);
					}
					
				else {
					println("You won");
					println(x);
					gameStatus = "won";
					break;
					}
				}
			}
		if (gameStatus == "lost") {
			println("You run out of guesses. YOU LOSE")
			}
	}
}



