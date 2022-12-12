class ChecksumAccumulatorFull {
  // var sum = 0
  private var sum = 0 // now sum can be changed only by methods of this class

  // parameters are `val`
  def add(b: Byte): Unit = {
    sum += b
  }
  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }
}

class ChecksumAccumulator { // short version
  private var sum = 0
  def add(b: Byte): Unit = {sum += b} // side effect only - procedure
  def checksum(): Int = ~(sum & 0xFF) + 1
}

import scala.collection.mutable
object ChecksumAccumulator { // singleton object
  /*
   * You'd use WeakHashMap for purpose of caching, because some entries can be
   * removed by garbage collector in case a of memory deficiency
   * */
  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}

// val acc = new ChecksumAccumulator
// val csa = new ChecksumAccumulator
//
// println(ChecksumAccumulator.calculate("Every value is an object"))

// acc.sum = 3
