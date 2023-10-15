//Quick Check 37.2 Implement a function called getCapitals that returns a list of
//the capitals in a key-value data structure representing a group of capitals and their
//countries.


def getCapitals(capitalToCountry: Map[String, String]): List[String] =
  capitalToCountry.keys.toList