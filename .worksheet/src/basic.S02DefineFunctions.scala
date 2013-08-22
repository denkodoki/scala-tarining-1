package basic

object S02DefineFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(109); 

	def max(x:Int, y:Int): Int = {
  	return if (x > y) x else y
  };System.out.println("""max: (x: Int, y: Int)Int""");$skip(17); val res$0 = 
  
  
  max(3,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(161); 
  
  def occ(c:Char, s:String) = {
  	def rocc(s:String, o:Int): Int =
  	  if (s.isEmpty) o else rocc(s.tail, o + (if (s.head == c) 1 else 0))
  	rocc(s,0)
  };System.out.println("""occ: (c: Char, s: String)Int""");$skip(29); val res$1 = 
  
  
  occ('s', "sombfgds");System.out.println("""res1: Int = """ + $show(res$1))}
  
}
