package day2

object day2 extends App {

  //iteration 3 FizzBuzz

  fizzBuzz("Fizz", "Buzz", 15)

  def fizzBuzz(fizz: String, buzz: String, num: Int) {
    for (i <- 1 to num by 1) {
      if (i % 3 == 0) {
        if (i % 5 == 0) {
          println(fizz + buzz)
        } else {
          println(fizz)
        }
      }
      else if (i % 5 == 0) {
        println(buzz)
      }
      else {
        println(i)
      }

    }
  }

  //iteration 4
  //4.1
  iterate("hi", 3)

  def iterate(word: String, number: Int): Unit = {
    if (number > 0) {
      println(word)
      iterate(word, number.-(1))
    }
  }

  //4.2
  iterateSq("H", 4)

  def iterateSq(word: String, number: Int): Unit = {
    val newWord = word * number
    iterate(newWord, number)
  }

  //4.3
  fizzBuzz2("Fizz", "Buzz", 15)

  def fizzBuzz2(fizz: String, buzz: String, num: Int): Any = {

    def repeat(fizz: String, buzz: String, num: Int, currentNum: Int): Any = {
      if (currentNum <= num) {
        currentNum match {
          case a if (a % 3 == 0 & a % 5 == 0) => println(fizz + buzz)
          case a if (a % 3 == 0) => println(fizz)
          case a if (a % 5 == 0) => println(buzz)
          case _ => println(currentNum)
        }
        repeat(fizz, buzz, num, currentNum.+(1))
      }
    }

    repeat(fizz, buzz, num, 1)
  }

  //Pattern Matching 2
  println(patternMatching(List(1,2)))

  def patternMatching(originalList: List[Int]) =  {
    originalList match {
      case _ => originalList.reverse
    }
  }
}
