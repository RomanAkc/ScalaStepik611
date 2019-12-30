//val ints: List[Int] = List(0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0)
val ints: List[Int] = List()

/*def printList(list: List[Int]) = list match {
  case Nil => println("qwe")
  case _ => list.mkString(", ")
}*/


val intsSorted = ints.sorted
val Index = intsSorted.lastIndexOf(0)

if(Index < 0) {
  println("")
  println(intsSorted.mkString(", "))
} else if(Index == intsSorted.size - 1) {
  println( intsSorted.mkString(", "))
  println("")
} else if(Index < 0 && Index == intsSorted.size - 1) {
  println("")
  println("")
} else {
  val (left, right) = intsSorted.splitAt(Index + 1)
  println(left.mkString(", "))
  println(right.mkString(", "))
}