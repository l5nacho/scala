import scala.io.StdIn.readLine
import scala.collection.mutable.Stack
import scala.util.control.Breaks._

object main{
  def main(args: Array[String]): Unit = {

    var eqStack = Stack[Char]();
    var equation = readLine("Introduce tu ecuacion: ");
    var validation: String = "valid"
    
    breakable {for (w <- equation) {
      if (w == '(') {
        eqStack.push(w)
        //println(eqStack)
      }
      if (w == ')') {
        //println(eqStack.pop())
        if (eqStack.isEmpty) {
          println("La ecuacion no es valida");
          validation = "invalid"
          break;
          }
        else {
          eqStack.pop();
          //println(eqStack);
          } 
        }
      }
    }
    if (validation == "valid"){
      if (!eqStack.isEmpty){
        println("La ecuacion no es valida");
        }
      else {
        println("La ecuacion es valida")
      }
    }
  }
}
