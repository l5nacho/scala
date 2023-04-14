import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks._

object main{

class Producto(var name: String, var prize: Int, var count: Int) {
	
	def printData() : Unit = {
		println("Created product with name " + name + " prize " + prize + " and quantity " + count)
	}
}

def main(args: Array[String]) : Unit = {

	var bufferList = ListBuffer[Producto]();
	var option: String = " ";
	var compra: String = "continuar"
	
	println("Elige una opcion: ")
	println("1. Introduce un producto: ")
	println("2. Salir")
		
	while (compra != "cerrar") {
		
		option = readLine("Por favor introduce la opcion que quieres: ")
		
		if (option == "1") {
			var n = readLine("Introduce el nombre del producto: ");
			var p = readLine("Introduce el precio del producto: ").toInt;
			var q = readLine("Introduce la cantidad de productos" ).toInt; 
		
			var product = new Producto(n, p, q)
			product.printData()
			bufferList += product
			}
		
		else {
			compra = "cerrar";
			}
		}
	for (w <- bufferList) {
		w.printData()
	}
	

	}

}

