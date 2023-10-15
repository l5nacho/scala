//Quick Check 35.2 Define a function called sumInRange that takes a set of doubles
//  and returns the sum of all its values with those between 0 and 100 excluded. For
//example, given the numbers 0.5, -1, 0 50.5, 99, and 100, it should return the dou-
//  ble 150.00.


def sumInRange(numbers: Set[Double]): Double = {
  val nums = numbers.filter(num => num > 0 && num < 100)
  nums.sum
}