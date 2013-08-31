package functions

object S03Closusres {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 

  println("Closures and free variables");$skip(20); 
  
  var delta = 1;System.out.println("""delta  : Int = """ + $show(delta ));$skip(68); ;
  val increment = (i: Int) => i + delta;System.out.println("""increment  : Int => Int = """ + $show(increment ));$skip(20); val res$0 =  // delta is a free variable
  
  increment(12);System.out.println("""res0: Int = """ + $show(res$0));$skip(12); 
  delta = 2;$skip(16); val res$1 = 
  increment(12);System.out.println("""res1: Int = """ + $show(res$1));$skip(18); 
  
  var sum = 0;System.out.println("""sum  : Int = """ + $show(sum ));$skip(30); ;
  (1 to 10).foreach(sum += _);$skip(6); val res$2 = 
  sum;System.out.println("""res2: Int = """ + $show(res$2));$skip(61); 
  
  
  def makeInreaser(delta: Int) = (i: Int) => i + delta;System.out.println("""makeInreaser: (delta: Int)Int => Int""");$skip(82); 
                                                  
  val inc10 = makeInreaser(10);System.out.println("""inc10  : Int => Int = """ + $show(inc10 ));$skip(33); 
  val inc100 = makeInreaser(100);System.out.println("""inc100  : Int => Int = """ + $show(inc100 ));$skip(15); val res$3 = 
  
  inc10(10);System.out.println("""res3: Int = """ + $show(res$3));$skip(13); val res$4 = 
  inc100(10);System.out.println("""res4: Int = """ + $show(res$4))}
  
  
}
