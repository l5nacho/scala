import scala.io.StdIn.readLine

object main {

	val secret_card = 12345;
	val secret_code = 1234;
	var balance = 1000;
	var cerrar = false;

	def main(args: Array[String]) : Unit = {
	
	var x = readLine("Introduce los cinco digitos de tu clave: ");
	var card = x.toInt;
	
	if (card == secret_card) {
		
		var y = readLine("Introduce tu clave: ");
		var code = y.toInt;
		
		if (code == secret_code) {
			println("El codigo es correcto")
			println("Que accion quieres realizar ")
			
			
			while (cerrar == false) {
			
				var option: String = readLine("Elige entre las siguientes opciones: saldo, sacar, depositaro o salir ")
				
				if (option == "saldo") {check_balance()}
				else if (option == "sacar") {withdraw()}
				else if (option == "depositar") {deposit()}
				else if (option == "salir") {quit()}
				else {println("Lo siento, esa opcion no esta disponible")}
			}
			println("Gracias por tus operaciones")
		}
		
		else {
			println("Lo siento, el codigo no es correcto")
		}
		
	}
	
	else {
		println("Lo siento, el numero no coincide con ninguna tarjeta")
	}
	}
	
	def check_balance() : Unit = {
	
		println("Tu saldo disponible es " + balance + " euros");
	}
	
	def withdraw() : Unit = {
	
		var a = readLine("Cuanto dinero quieres sacar? ");
		var amount = a.toInt;
		
		if (amount > balance) {
			println("Lo siento, no tienes suficiente credito");
		} 
		
		else {
		
			balance = balance - amount;
			println("Has sacado un total de " + amount + " euros");
			println("Tienes un saldo disponible de " + balance);
		
		}
	
	}
	
	def deposit(): Unit = {
		var a = readLine("Cuanto dinero quieres depositar");
		var deposit = a.toInt;
		balance = balance + deposit;
		
		println("Has depositado un total de " + deposit + " euros");
		println("Tienes un saldo disponible de " + balance + " euros");
	}
	
	def quit(): Unit = {
		cerrar = true
	}


}