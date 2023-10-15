//Quick Check 34.6 Rewrite the function crossMultiplier you implemented in Quick
//Check 34.5 using for-comprehension .

//def crossMultiplier(groupA: Set[Int], groupB: Set[Int]): Set[Int] =
//  groupA.flatMap(m => groupB.map(_ * m))

def crossMultiplierFor(groupA: Set[Int], groupB: Set[Int]): Set[Int] =
  for {
    n <- groupA
    s <- groupB
  } yield n * s