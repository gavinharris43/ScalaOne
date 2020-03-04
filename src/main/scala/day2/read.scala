package day2

import scala.collection.mutable.ListBuffer
import scala.io.Source

object read extends App {

  val filename = "src/main/scala/day2/keys.txt"

  println(findWords(3, List("qwertyuiopasdfghjklzxcvbnm", "abcd", "efgh")))

  def findWords(keySetsTotal: Int, keySets: List[String]): ListBuffer[String] = {

    val longestWords: scala.collection.mutable.ListBuffer[String] = ListBuffer[String]()
    for (i <- 1 until keySetsTotal + 1 by +1) {
      var longestWord: String = null
      val keys = keySets(i.-(1)).toCharArray.toList

      def readFile = {
        for (line <- Source.fromFile(filename).getLines) {
          var allAvailable: Boolean = true

          line.toCharArray.foreach(char => if (!keys.contains(char)) {
            allAvailable = false
          })

          if (allAvailable) {
            if (longestWord == null || longestWord.length < line.length) {
              longestWord = line
            }
          }
        }
      }
      readFile
      longestWords.addOne(longestWord)
    }
    longestWords
  }

}
