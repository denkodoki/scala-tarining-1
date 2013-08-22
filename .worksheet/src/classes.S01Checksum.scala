package classes

object S01Checksum {

  class ChecksumAccumulator {
    private var sum = 0
    def add(b: Byte): Unit = sum += b
    def checksum(): Int = ~(sum & 0xFF) + 1
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(313); 

  def checksum(s: String): Int = {
    val cs = new ChecksumAccumulator
    s.getBytes("UTF-8").foreach(cs.add)
    cs.checksum
  };System.out.println("""checksum: (s: String)Int""");$skip(24); val res$0 = 
  checksum("bamlamber");System.out.println("""res0: Int = """ + $show(res$0));$skip(24); val res$1 = 
  checksum("Ugachacka");System.out.println("""res1: Int = """ + $show(res$1))}
}
