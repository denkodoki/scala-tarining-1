package functions

object S02PartiallyApplied {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 

  println("Pertially applied functions");$skip(51); 
  
  def add(a: Double, b: Double): Double = a + b;System.out.println("""add: (a: Double, b: Double)Double""");$skip(22); 
  
  val add2 = add _;System.out.println("""add2  : (Double, Double) => Double = """ + $show(add2 ));$skip(15); val res$0 = 
  
  add2(3,7);System.out.println("""res0: Double = """ + $show(res$0));$skip(30); 
  
  val add3= add(3, _: Int);System.out.println("""add3  : Int => Double = """ + $show(add3 ));$skip(13); val res$1 = 
  
  add3(7);System.out.println("""res1: Double = """ + $show(res$1));$skip(31); 
  
  val add4 = add(_: Int, 7);System.out.println("""add4  : Int => Double = """ + $show(add4 ));$skip(10); val res$2 = 
  add4(3);System.out.println("""res2: Double = """ + $show(res$2))}
}
