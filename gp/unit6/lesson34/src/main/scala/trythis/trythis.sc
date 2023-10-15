//TRY THIS Define a function that takes a set of books to return the set of genres
//  a given author has written. Use the following case class to represent a book:

case class Book(title: String,
                authors: List[String],
                genres: Set[String])

def genresAuthors(books: Set[Book], author: String): Set[String] =
  for {
    book <- books
    if book.authors.contains(author)
    genres <- book.genres
  } yield genres