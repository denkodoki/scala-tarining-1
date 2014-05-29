package basic

object S02DefineVariables {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 

  // define variables
  
	val s = "Hi";System.out.println("""s  : String = """ + $show(s ));$skip(12); 
	val i = 10;System.out.println("""i  : Int = """ + $show(i ));$skip(22); 
   
  var n: Int = 3;System.out.println("""n  : Int = """ + $show(n ));$skip(8); 
  n = 5;$skip(4); val res$0 = 
  n;System.out.println("""res0: Int = """ + $show(res$0));$skip(56); 
  
  // semicolon infrence
  
  val x = 1; val y = 23;System.out.println("""x  : Int = """ + $show(x ));System.out.println("""y  : Int = """ + $show(y ));$skip(8); val res$1 = 
  x + 1;System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
  x +
  1;System.out.println("""res2: Int = """ + $show(res$2));$skip(4); val res$3 = 
  x;System.out.println("""res3: Int = """ + $show(res$3));$skip(5); val res$4 = 
  +1;System.out.println("""res4: Int = """ + $show(res$4));$skip(12); val res$5 = 
  (x
  + 1);System.out.println("""res5: Int = """ + $show(res$5))}
}
