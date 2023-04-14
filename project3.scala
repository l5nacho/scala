object main {

	class Number(var value: Int){
	
	def suma(other: Number): Int = {
		return value + other.value
	}
	
	def comparador(other: Number): Boolean = {
		if (value > other.value) {
			return true
		}
		else {
			return false
		}
	
	}
	}

	def main(args: Array[String]): Unit = {
		
		var n1 = new Number(1);
		var n2 = new Number(4);
		println(n1.value);
		println(n1.suma(n2));
		println(n1.comparador(n2));
		println(n2.comparador(n1));
		println("Hello, world, from a script!");
	}

}