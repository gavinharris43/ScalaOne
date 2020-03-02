package day1

import java.util.Calendar.HOUR_OF_DAY

object Main extends App {
  // : String not needed
  var helloMsg: String = "Hello World"
  val name = "Gavin"
  val hour = HOUR_OF_DAY

  // Type Inference
  println(returnMe(11))

  def returnMe(returnObject: Any) = {
    returnObject
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
