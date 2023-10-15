//Quick Check 32.3 Write a function sumOfFirstN to sum all numbers for 0 to n
//inclusive:
//def sumOfFirstN(n: Int): Int
//For example, sumOfFirstN(10) should return 55 , and sumOfFirstN(-10) should return
//0 . HINT: You can generate a sequential structure containing all numbers from 0 to n
//inclusive using the operator to . For example, the expression 0 to 3 returns a range
//containing the numbers 0, 1, 2, and 3.

def sumOfFirstN(n: Int): Int =
  (0 to n).toList.sum
