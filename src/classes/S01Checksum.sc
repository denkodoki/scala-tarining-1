package classes

object S01Checksum {

  class ChecksumAccumulator {
    private var sum = 0
    def add(b: Byte): Unit = sum += b
    def checksum(): Int = ~(sum & 0xFF) + 1
  }

  def checksum(s: String): Int = {
    val cs = new ChecksumAccumulator
    s.getBytes("UTF-8").foreach(cs.add)
    cs.checksum
  }                                               //> checksum: (s: String)Int
  checksum("bamlamber")                           //> res0: Int = -163
  checksum("Ugachacka")                           //> res1: Int = -120
}