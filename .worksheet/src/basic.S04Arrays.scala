package basic

object S04Arrays {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 

  val sa = new Array[String](3);System.out.println("""sa  : Array[String] = """ + $show(sa ));$skip(20); 
  
  sa(0) = "How";$skip(16); 
  sa(1) = "are";$skip(20); 
  
  sa(2) = "you";$skip(22); 
  sa.update(2,"you?");$skip(8); val res$0 = 
  sa(2);System.out.println("""res0: String = """ + $show(res$0));$skip(14); val res$1 = 
  
  sa.head;System.out.println("""res1: String = """ + $show(res$1));$skip(10); val res$2 = 
  sa.tail;System.out.println("""res2: Array[String] = """ + $show(res$2));$skip(13); val res$3 = 
  sa.reverse;System.out.println("""res3: Array[String] = """ + $show(res$3));$skip(9); val res$4 = 
  sa.max;System.out.println("""res4: String = """ + $show(res$4));$skip(25); val res$5 = 
  sa.foldRight(" ")(_+_);System.out.println("""res5: String = """ + $show(res$5));$skip(51); val res$6 = 
  sa.foldRight(sa(0))((a,b) => if(a > b) a else b);System.out.println("""res6: String = """ + $show(res$6));$skip(19); val res$7 = 
  sa.mkString(" ");System.out.println("""res7: String = """ + $show(res$7));$skip(22); val res$8 = 
  sa.sortBy(_.length);System.out.println("""res8: Array[String] = """ + $show(res$8))}
}
