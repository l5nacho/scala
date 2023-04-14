import scala.io.StdIn.readLine

object main {

	def main(args : Array[String]) : Unit = {
	
		var bill : Int = get_bill_amount();
		var discount : Int = get_discount_amount;
		var bill_desc : Int = 0;
		
		if (discount == 0) {
			bill_desc = apply_discount(bill)
		}
		
		else {
			bill_desc = apply_discount(bill, discount)
		}
		
		
		show_bill(bill_desc, bill)
	
	}
	
	def get_bill_amount() : Int = {
	
		var x = readLine("Introduce el total de tu factura: ");
		var bill = x.toInt;
		
		return bill
	}
	
	def get_discount_amount() : Int = {
	
		var x = readLine("Introduce el valor de descuento");
		var descuento = x.toInt;

		return descuento 
	
	} 
	
	def apply_discount(bill : Int, disc : Int = 10 ) : Int = {
	
		return (bill - disc) 
	
	} 
	
	def show_bill(disc : Int, bill : Int) : Unit = {
	
		println("El valor de la factura con descuento es " + disc)
		println("El valor de la factura sin descuento es " + bill)
	
	}

}