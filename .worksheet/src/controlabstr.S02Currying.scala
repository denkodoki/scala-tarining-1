package controlabstr

object S02Currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 

	def curriedSum(x:Int)(y: Int) = x + y;System.out.println("""curriedSum: (x: Int)(y: Int)Int""");$skip(18); val res$0 = 
	curriedSum(4)(6);System.out.println("""res0: Int = """ + $show(res$0));$skip(72); 
	
	// transform to partially apllied function
	val pcs = curriedSum(4)_;System.out.println("""pcs  : Int => Int = """ + $show(pcs ));$skip(8); val res$1 = 
	pcs(6);System.out.println("""res1: Int = """ + $show(res$1));$skip(60); 

  // take it apart
  def first(x: Int) = (y: Int) => x + y;System.out.println("""first: (x: Int)Int => Int""");$skip(24); 
  def second = first(4);System.out.println("""second: => Int => Int""");$skip(12); val res$2 = 
  second(6);System.out.println("""res2: Int = """ + $show(res$2))}
	
}
