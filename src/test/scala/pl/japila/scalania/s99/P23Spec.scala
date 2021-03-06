package pl.japila.scalania.s99

import org.specs2.mutable._
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P23Spec extends Specification with ExamplesBlock {
  "P23 solution" should {
    "Extract a given number of randomly selected elements from a list." in {
      import S99_P23._
      solutions[Symbol].foreach {
        case (solution, randomSelectImpl) =>
          solution >> {
            val input = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
            val output = randomSelectImpl(3, input)
            output.distinct.size === 3
            output.forall(input.contains(_)) === true
          }
      }
    }
  }
}