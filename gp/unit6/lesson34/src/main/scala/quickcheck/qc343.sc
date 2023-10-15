//Quick Check 34.3 Define a function called allUpper that takes a set of words and
//returns a new one in which each element is now uppercase.

def allUpper(words: Set[String]): Set[String] = {
  words.map(x => x.toUpperCase)
  //words.map(_.toUpperCase)
}
