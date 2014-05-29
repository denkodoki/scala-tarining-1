package functions

object S04SpecialCalls {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Special function calls");$skip(85); 

  /*
   Repeated parameters
   */
  def echo(args: String*) = args foreach println;System.out.println("""echo: (args: String*)Unit""");$skip(19); 
  echo("AC", "DC");$skip(33); 

  val acdc = Array("AC", "DC");System.out.println("""acdc  : Array[String] = """ + $show(acdc ));$skip(113); 
  // ? echo(acdc)

  /*
   Named parameters
   */
  def speed(distance: Double, time: Double) = distance / time;System.out.println("""speed: (distance: Double, time: Double)Double""");$skip(35); val res$0 = 
  speed(time = 45, distance = 100);System.out.println("""res0: Double = """ + $show(res$0));$skip(24); val res$1 = 
  speed(100, time = 45);System.out.println("""res1: Double = """ + $show(res$1));$skip(151); 
  //? speed(time = 45, 100)

  /*
   Default parameter values
   */
  def rate(amount: Int = 100, price: Int = 100): Double = price.toDouble / amount;System.out.println("""rate: (amount: Int, price: Int)Double""");$skip(9); val res$2 = 
  rate();System.out.println("""res2: Double = """ + $show(res$2));$skip(19); val res$3 = 
  rate(price = 80);System.out.println("""res3: Double = """ + $show(res$3));$skip(129); 

  /*
   Tail recursion
   */

  def boom(x: Int): Int =
    if (x == 0) throw new Exception("boom!")
    else boom(x - 1) + 1;System.out.println("""boom: (x: Int)Int""");$skip(174); 
    // not tail recusive: the recursive call is not the last action
    
    

  def bang(x: Int): Int =
    if (x == 0) throw new Exception("bang!")
    else bang(x - 1);System.out.println("""bang: (x: Int)Int""")}
    // the recursive call is he last action
    
 // boom(3)
 // bang(3)

}
