package implicits

object S01Implicits {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 

  println("Implicits");$skip(21); 
  
  val f: Funy = 1;System.out.println("""f  : implicits.Funy = """ + $show(f ));$skip(20); val res$0 = 
  
  Funy(1) ++ 2.0
  
  import Funy._;System.out.println("""res0: implicits.Funy = """ + $show(res$0));$skip(31); val res$1 = 
  
  1 ++ 2;System.out.println("""res1: implicits.Funy = """ + $show(res$1));$skip(30); val res$2 = 
  Funy(1).stringPair(Funy(2));System.out.println("""res2: String = """ + $show(res$2))}
  
}
