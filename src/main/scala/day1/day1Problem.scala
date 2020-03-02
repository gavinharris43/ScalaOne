package day1

object day1Problem extends App {

  println(function(2, 5, 5))

  def function(A: Int, B: Int, C: Int) = {

    val list = List(A, B, C)
    val sortedList = list.sorted
    (sortedList(0) + sortedList(1)) * sortedList(2)
  }

  bottlesOfBeer(100)

  def bottlesOfBeer(number: Int): Unit = {

    for (number <- number until 0 by -1

         ) {
      println(s"$number bottles of beer on the wall, $number bottles of beer.")
      number.-(1)
      println(s"Take one down and pass it around, ${number.-(1)} bottles of beer on the wall.")

    }
    println("No More Beers on the wall buy more beers ")

  }

}
