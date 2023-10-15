//Quick Check 34.5 Using the flatMap operation, define a function called cross-
//Multiplier that takes two sets of integers as its parameters and returns a new one
//containing all the numbers produced by multiplying each element of the first one for
//the second.

def crossMultiplier(groupA: Set[Int], groupB: Set[Int]): Set[Int] =
  groupA.flatMap(m => groupB.map(_ * m))