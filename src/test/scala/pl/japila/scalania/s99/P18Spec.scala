package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P18.slice
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P18Spec extends Specification {
  "P18 solution" should {
    "Extract a slice from a list." in {
      val actual = slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      actual === List('d, 'e, 'f, 'g)
    }
  }
}