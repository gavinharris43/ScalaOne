package scala
import org.scalatest._
import org.scalamock.scalatest._



abstract class UnitSpec extends FlatSpec with
  OptionValues with Inside with Inspectors with MockFactory