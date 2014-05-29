package classes

object S01Checksum {

  class ChecksumAccumulator {
    private var sum = 0
    def add(b: Byte): Unit = sum += b
    def checksum(): Int = ~(sum & 0xFF) + 1
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(314); 

  def checksum(s: String): Int = {
    val cs = new ChecksumAccumulator
    s.getBytes("UTF-8").foreach(cs.add)
    cs.checksum
  };System.out.println("""checksum: (s: String)Int""");$skip(24); val res$0 = 
  checksum("bamlamber");System.out.println("""res0: Int = """ + $show(res$0));$skip(24); val res$1 = 
  checksum("Ugachacka")
  
 // type hierarchiy
 
 // nothing
 
 type ??? = Nothing;System.out.println("""res1: Int = """ + $show(res$1));$skip(84); 
 
 def print: Unit = ???
 
 // print
  
 // initialization, type parameters
 
 class State(s: String) {
   def this(ss: Int) = this(ss.toString)
   var ints:String = s
   def state = ints
   def state_=(ns: String) {ints = ns}
 };System.out.println("""print: => Unit""");$skip(230); 
 
 val s = new State(1);System.out.println("""s  : classes.S01Checksum.State = """ + $show(s ));$skip(9); val res$2 = 
 s.state;System.out.println("""res2: String = """ + $show(res$2))}
}
