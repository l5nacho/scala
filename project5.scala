import scala.io.StdIn.readLine
import scala.collection.mutable.Map

object Main {

  def main(Args: Array[String]): Unit = {

    var wordMap = Map[String, Int]();
    var numWords: Int = readLine("Enter number of words: ").toInt;
    var count: Int = 1

    for (w <- 1 to numWords) {
      val word: String = readLine("Introduce palabra " + w + ": ");
      
      if (wordMap.contains(word)) { 
        var recount: Int = wordMap(word) + 1;
        wordMap(word) = recount;
      }

      else {
         wordMap += (word -> count);
      
      }
      
    }

    //println(wordMap);
    var request: String = readLine("¿Que palabra quieres mirar si ha aparecido? ")
    
    if (wordMap.contains(request)) {
      println("La palabra " + request + " aparece " + wordMap(request) + " veces.")
    }

    else {
      println("La palabra " + request + " no esta en la lista")
    }

  }

}
