package day4

import scala.collection.mutable.ListBuffer

object day4 extends App {

  // Day 4: Card Problem
  println(cardValid(4137894711755904l))

  def cardValid(number: Long) = {
    val list: ListBuffer[Int] = ListBuffer.empty
    number.toString.foreach(char => list.addOne(char.toString.toInt))
    for (i <- list.length-2 to 0  by -2) {
      list.update(i, list(i) * 2)
      if (list(i) >= 10) {
        list.update(i, sumDigits(list(i)))
      }
    }
     println(list.sum)
     list.sum % 10 == 0
  }

    def sumDigits(num: Int) ={
        num.toString.map(_.asDigit).sum
    }




}
