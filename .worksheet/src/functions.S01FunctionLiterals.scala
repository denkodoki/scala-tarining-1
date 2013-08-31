package functions

object S01FunctionLiterals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 

  
	val incr = (x: Int) => x + 1;System.out.println("""incr  : Int => Int = """ + $show(incr ));$skip(9); val res$0 = 
	incr(2);System.out.println("""res0: Int = """ + $show(res$0));$skip(84); 
	
	val pr = (a: String, i: Int, f: Int => Int) => {
		println(a)
		println(f(i))
	};System.out.println("""pr  : (String, Int, Int => Int) => Unit = """ + $show(pr ));$skip(35); 
	
	pr("Increment by one", 3, incr);$skip(45); 
	pr("Make it double", 10, (x: Int) => x * 2);$skip(29); 
	pr("Squere", 5, x => x * x);$skip(30); 
	pr("Make if half", 8, _ / 2)}
	
                                                  
}
