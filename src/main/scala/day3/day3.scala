package day3

import java.util.TimeZone.getAvailableIDs

import scala.collection.mutable.ArrayBuffer

object day3 extends App {

  println(functional1.toList)

  def functional1() = {
    getAvailableIDs.map(el => el.split('/'))
      .filter(found => found.length > 1)
      .map(array => array(1))
      .grouped(10)
      .collect(mainArray => mainArray(0))
      .toArray
  }

  blackjack(22, 22) // 0

  def blackjack(num1: Int, num2: Int) = {
    List(num1, num2)
      .filter(num => num < 22)
      .sorted
      .lastOption
      .getOrElse(0)
  }

  //todo compleate unique sum
  def uniqueSum(num1: Int, num2: Int, num3: Int) = {
    val listTuple: scala.collection.mutable.Set[(Int, Int)] = scala.collection.mutable.Set[(Int, Int)]()
    val list = List(num1, num2, num3).sorted
    //    list.foreach(num => if (listTuple.contains(num,_)){
    //      listTuple.update(num,i++)
    //
    //    }else{
    //      listTuple.addOne(num,1)
    //
    //    })
  }

  println(tooHot(91, true)) //false

  def tooHot(temp: Int, summer: Boolean): Boolean = {
    val min = 60
    val max = if (summer) 100 else 90
    if (min <= temp && temp <= max) {
      false
    } else {
      true
    }
  }

}