//Quick Check 36.6 Reimplement the following snippet of code using for-comprehension :
//  Map("hello" -> 1, "scala" -> 10).flatMap { case (w, n) =>
//  if (w.length > n ) Some(w -> n) else None
//}

for {
  (w, n) <- Map("hello" -> 1, "scala" -> 10)
  if w.length > n
} yield (w -> n)