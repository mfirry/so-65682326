package yolo

import org.scalameter.api._
import org.scalameter.picklers.Implicits._

object UUIDBench extends Bench.LocalTime {
  val sizes: Gen[Int] = Gen.range("size")(300000, 1500000, 300000)

  val ranges: Gen[Range] = for {
    size <- sizes
  } yield 0 until size

  performance of "Range" in {
    measure method "lengthOfUUID" in {
      using(ranges) in { r =>
        yolo.Main.lengthOfUUID()
      }
    }
  }
}
