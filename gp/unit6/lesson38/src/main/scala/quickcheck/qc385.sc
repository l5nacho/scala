//Quick Check 38.5 Reimplement the following snippet of code using for-comprehension :
//def validation(a: Either[String, Int],
//               b: Either[String, Int]): Either[String, Int] =
//  a.flatMap { aa =>
//    b.map(bb => aa + bb)
//  }

def validation(a: Either[String, Int],
               b: Either[String, Int]): Either[String, Int] =
  for {
    aa <- a
    bb <- b
  } yield aa + bb