package basic

object S02DefineVariables {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 

  // define variables
  
	val s: String = "Hi";System.out.println("""s  : String = """ + $show(s ));$skip(16); 
   
  var n = 3;System.out.println("""n  : Int = """ + $show(n ));$skip(54); 
  
  // semicolon infrence
  
  val x = 1; val y = 23;System.out.println("""x  : Int = """ + $show(x ));System.out.println("""y  : Int = """ + $show(y ));$skip(8); val res$0 = 
  x + 1;System.out.println("""res0: Int = """ + $show(res$0));$skip(4); val res$1 = 
  x;System.out.println("""res1: Int = """ + $show(res$1));$skip(5); val res$2 = 
  +1;System.out.println("""res2: Int = """ + $show(res$2));$skip(12); val res$3 = 
  (x
  + 1);System.out.println("""res3: Int = """ + $show(res$3))}
}
