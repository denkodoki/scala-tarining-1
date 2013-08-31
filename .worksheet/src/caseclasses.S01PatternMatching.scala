package caseclasses

object S01PatternMatching {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(81); 

  println("Pattern matching");$skip(227); 

  // Constant patterns and the wildcard pattern

  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else"
  };System.out.println("""describe: (x: Any)String""");$skip(21); val res$0 = 

  describe((1, 2))

  import math.{ E, Pi };System.out.println("""res0: String = """ + $show(res$0));$skip(32); val res$1 = 

  E;System.out.println("""res1: Double = """ + $show(res$1));$skip(5); val res$2 = 
  Pi;System.out.println("""res2: Double = """ + $show(res$2));$skip(79); val res$3 = 

  E match {
    case Pi => "strange math? Pi = " + Pi
    case _ => "OK"
  };System.out.println("""res3: String = """ + $show(res$3));$skip(55); 

  // Variable pattern

  val expr: Any = List(1, 2);System.out.println("""expr  : Any = """ + $show(expr ));$skip(95); val res$4 = 
  expr match {
    case 0 => "zero"
    case somethingElse => "not zero: " + somethingElse
  };System.out.println("""res4: String = """ + $show(res$4));$skip(45); 

  // Varibale or constant?

  val pi = Pi;System.out.println("""pi  : Double = """ + $show(pi ));$skip(77); val res$5 = 
  E match {
    case pi => "strange math? Pi = " + Pi
    case _ => "OK"
  };System.out.println("""res5: String = """ + $show(res$5))}
  
}
