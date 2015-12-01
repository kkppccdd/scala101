package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P31._
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P31Spec extends Specification {
  "P31 solution" should {
    "Determine whether a given integer number is prime." in {
      7.isPrime
    }
  }
}
