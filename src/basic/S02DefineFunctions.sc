package basic

object S02DefineFunctions {

	def max(x:Int, y:Int): Int = {
  	return if (x > y) x else y
  }                                               //> max: (x: Int, y: Int)Int
  
  
  max(3,5)                                        //> res0: Int = 5
  
  def max2(x:Int, y:Int) = if (x > y) x else y    //> max2: (x: Int, y: Int)Int
  
  max2(11, 4)                                     //> res1: Int = 11
  
  def occ(c:Char, s:String) = {
  	def rocc(s:String, o:Int): Int =
  	  if (s.isEmpty) o else rocc(s.tail, o + (if (s.head == c) 1 else 0))
  	rocc(s,0)
  }                                               //> occ: (c: Char, s: String)Int
  
  
  occ('s', "sombfgds")                            //> res2: Int = 2
  
  def proc {println("Hello")}                     //> proc: => Unit
  proc                                            //> Hello
}