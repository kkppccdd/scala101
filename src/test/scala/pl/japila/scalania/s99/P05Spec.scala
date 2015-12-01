package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P05.reverse
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P05Spec extends Specification {
  "P05 solution" should {
    "Reverse a list." in {
      reverse(Seq(1, 1, 2, 3, 5, 8)) === Seq(8, 5, 3, 2, 1, 1)
      reverse(Nil) === Nil
      reverse(Seq(1)) === Seq(1)
    }
  }
}