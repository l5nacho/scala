class Point(var x: Int = 0, var y: Int = 0)

val origin = new Point    // x and y are both set to 0
val point1 = new Point(1) // x is set to 1 and y is set to 0
println(point1.x)           // prints (1, 0)