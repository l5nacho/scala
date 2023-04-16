import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks._

object main{

class Producto(var name: String, var prize: Int, var count: Int) {

  var totalPrize = prize * count

  def printData() : Unit = {
    println("Created product with name " + name + " prize " + prize + " and quantity " + count)
    println("The total prize is " + totalPrize)
	}
}

def main(args: Array[String]) : Unit = {

  var bufferList = ListBuffer[Producto]();
  var option: String = " ";
  var compra: String = "continuar";
  var totalBill: Int = 0;

  showOptions();
	
  do {
		
  option = readLine("Por favor introduce la opcion que quieres: ");
		
  if (option == "1") {
    
    var product: Producto = createProduct();

    //product.printData()
    bufferList += product;
    }
		
  else {
    compra = "cerrar";
      }

    }

  while (compra != "cerrar"); 
  
  for (w <- bufferList) {
    w.printData();
    totalBill += w.totalPrize;
      }
  println("The total bill is " + totalBill);
    }

  def showOptions(): Unit = {

  println("Elige una opcion: ")
  println("1. Introduce un producto: ")	
  println("2. Salir")
	
  }

  def createProduct(): Producto = {

    var n = readLine("Introduce el nombre del producto: ");
    var p = readLine("Introduce el precio del producto: ").toInt;
    var q = readLine("Introduce la cantidad de productos: " ).toInt; 
    
    var product = new Producto(n, p, q);

    return product
 
  }


  

}

