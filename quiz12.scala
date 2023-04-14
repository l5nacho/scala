import scala.io.StdIn.readLine

object main {

	def main(args : Array[String]) : Unit = {
	
		var string1 = readLine("Introduce una palabra: ")
		var string2 = readLine("Introduce otra palabra: ")
		
		println(concat_string(string1, string2))
	
	}
	
	def concat_string(a : String, b : String) : String = {
	
		return a + b
	
	}

}