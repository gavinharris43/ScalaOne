package day1

import java.util.Calendar.HOUR_OF_DAY

object Main extends App {

  //Hello World, Assignment, Parameters, Return Types
  // : String not needed
  var helloMsg: String = "Hello World"
  val name = "Gavin"
  val hour = HOUR_OF_DAY

  // Type Inference
  println(returnMe(11))

  def returnMe(returnObject: Any) = {
    returnObject
  }

  //Strings
  strings("hello", 3)

  def strings(string: String, number: Int) = {
    string.splitAt(string.length - number)._2
  }

  //Strings 2

  println(strings2("ha", "llo", "a", "e"))

  def strings2(string1: String, string2: String, toReplace: String, replaceWith: String) = {
    val edited1 = string1.replace(toReplace, replaceWith)
    val edited2 = string2.replace(toReplace, replaceWith)
    edited1 + edited2
  }

  //Operators / Conditionals
  println(sumOf(0, 6, false))

  def sumOf(num1: Int, num2: Int, add: Boolean) = {

    if (add || num1== 0 || num2 == 0) {
      num1 + num2
    }
    else {
      num1 * num2
    }

  }

  //iteration
  iterate("hi",3)

  def iterate(word: String, number: Int): Unit ={
    for (i <- number until 0 by -1) {
      println(word)
    }
  }

  //iteration 2
  iterateSq("H",4)

  def iterateSq(word: String, number: Int): Unit ={
    for (i <- number until 0 by -1) {
      for (i <- number until 0 by -1) {
      print(word)
    }
      println("")
    }
  }

  def sayHello(name: Option[String] = null) {

    if (helloMsg == "Hello World") {

      if (hour < 12) {
        helloMsg = "Hello World Good Morning"
      }
      else {
        if (hour < 17) {
          helloMsg = "Hello World Good Afternoon"
        }
        else {
          helloMsg = "Hello World Good Evening"
        }
      }
    }
    if (name != null) {
      // s to allow input of variables with $ sign
      // f would also allow decimal
      // raw as written eg \n will not create a new line

      //Optional get, could use getOrElse
      println(helloMsg + s" My name is ${name.get} ")
    }
    else {
      println(helloMsg)
    }
  }

  // The following all equate to true
  //   val a = 12
  //   var b = a
  //
  //   (a == b )
  //   (a eq b)
  //
  //   b = 12
  //
  //   (a == b)
  //   (a ne b)
  //
  //   b = 7
  //   (a != b)


  sayHello(Option.apply(name))

  // to includes final number as until will only go up to number
  for (i <- 1 to 10 by 2
       // all conditions need to be met.
       if i > 3
       if i < 8
       ) print(i + " ")

}
