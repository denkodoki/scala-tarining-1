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
  
 // type hierarchiy
 
 // nothing
 
 type ??? = Nothing
 
 def print: Unit = ???                            //> print: => Unit
 
 // print
  
 // initialization, type parameters
 
 class State(s: String) {
   def this(ss: Int) = this(ss.toString)
   var ints:String = s
   def state = ints
   def state_=(ns: String) {ints = ns}
 }
 
 val s = new State(1)                             //> s  : classes.S01Checksum.State = classes.S01Checksum$$anonfun$main$1$State$1
                                                  //| @c2380d1
 s.state                                          //> res2: String = 1
}