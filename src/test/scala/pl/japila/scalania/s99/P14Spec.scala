package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P14.duplicate
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P14Spec extends Specification {
  "P14 solution" should {
    "Duplicate the elements of a list." in {
      duplicate(List('a, 'b, 'c, 'c, 'd)) === List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
    }
  }
}