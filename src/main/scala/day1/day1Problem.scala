package day1

object day1Problem extends App {

  println(function(2, 5, 5))

  def function(A: Int, B: Int, C: Int) = {

    val list = List(A, B, C).sorted
    (list(0) + list(1)) * list(2)
  }

  bottlesOfBeer(100)

  def bottlesOfBeer(number: Int)= {

    for (num <- number until 0 by -1) {
      if (num == 1) {
        println(s"1 bottle of beer on the wall, 1 bottle of beer.")
        println(s"Take one down and pass it around, 0 bottles of beer on the wall.")
      } else {
        println(s"$num bottles of beer on the wall, $num bottles of beer.")
        println(s"Take one down and pass it around, ${num.-(1)} bottles of beer on the wall.")
      }
    }
    println("No More Beers on the wall, go buy more beers!!!!!!!!!!!!! ")

  }

}
