object main {
	
	def main(args : Array[String]) : Unit = {
		println(greater_than(4,6));
		println(greater_than(9,2));
		println(greater_than(78,43));
		println(greater_than(456,609));
	}                            
	
	def greater_than(a : Int, other : Int) : Int = {
		
		//var greater : Int = 0;
		
		if (a > other) {
			//greater = a
			return a
		}
		
		else {
			//greater = other
			return other
		}
		
		//return greater
	}

}