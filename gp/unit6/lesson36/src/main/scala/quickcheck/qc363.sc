//Quick Check 36.3 In Quick Check 36.1, you defined a key-value data structure of
//type Map[Int, String] to represent the numbers and their corresponding days of the
//week. Use the operator -- to create a new map containing only weekdays (i.e., all
//but Saturday and Sunday).

val daysOfWeek: Map[Int, String] = Map(1 -> "Monday", 2 -> "Tuesday", 3 -> "Wednesday", 4 -> "Thursday", 5 -> "Friday",
  6 -> "Saturday", 6 -> "Sunday")

val weekDays: Map[Int, String] = daysOfWeek -- List(6, 7)
