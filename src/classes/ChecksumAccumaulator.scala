package classes

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {
  import collection.mutable.Map
  private val cache = Map[String, Int]()
  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      def checksum(s: String): Int = {
        val cs = new ChecksumAccumulator
        s.getBytes.foreach(cs.add)
        cs.checksum
      }
      val cs = checksum(s)
      cache += (s -> cs)
      cs
    }
}
