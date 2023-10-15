//Quick Check 37.3 Implement a function called longestCapitalName that takes a
//capital-to-country key-value structure and returns the capital with the longest name.

def longestCapitalName(capitalToCountry: Map[String, String]): String = {
  val (capital, _) = capitalToCountry.maxBy { case (c, _) => c.length }
  capital
}
