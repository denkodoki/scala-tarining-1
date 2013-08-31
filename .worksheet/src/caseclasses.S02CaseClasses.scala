package caseclasses

object S02CaseClasses {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  println("Case Classes");$skip(73); 
  
  // Case classes and the constructor pattern
  
  val v = Var("x");System.out.println("""v  : caseclasses.Var = """ + $show(v ));$skip(37); 
  val l = Lambda(Var("x"), Var("x"));System.out.println("""l  : caseclasses.Lambda = """ + $show(l ));$skip(29); 
  val a = Apply(l, Var("y"));System.out.println("""a  : caseclasses.Apply = """ + $show(a ));$skip(382); 

  def matchLambda(e: Expr): String = {
  	def agregate(s: String, e: Expr): String = e match {
  		case Var(name)         => name
  		case Lambda(arg, body) =>  s"(L${agregate("", arg)}.${agregate("", body)})"
  		case Apply(fun, expr)   => s"(${agregate("", fun)} ${agregate("", expr)})"
  		// Expr is a sealed class no nead for the wildcard pattern
  	}
  	agregate("", e)
  };System.out.println("""matchLambda: (e: caseclasses.Expr)String""");$skip(21); val res$0 = 
  
  matchLambda(l);System.out.println("""res0: String = """ + $show(res$0));$skip(17); val res$1 = 
  matchLambda(a);System.out.println("""res1: String = """ + $show(res$1));$skip(477); 
  

  // Sequence patterns
  def matchList(e: List[_]) = e match {
  	case List() => "Empty List"
  	case List(x) => s"List with single element: $x"
  	case List(x, y) if x == y => s"$x two times (Example for pattern guard)"
  	case List(x, y) => s"two elements: $x and $y"
  	case List(x, _, _) => s"Three elemnts, first is $x"
  	case List(head, tail @ _*) => s"At least four elements: $head :: $tail"
  	case _ => "Not expected case (Exaple for the wildcard pattern)"
  };System.out.println("""matchList: (e: List[_])String""");$skip(24); val res$2 = 
  
  matchList(List());System.out.println("""res2: String = """ + $show(res$2));$skip(23); val res$3 = 
  matchList(List("x"));System.out.println("""res3: String = """ + $show(res$3));$skip(28); val res$4 = 
  matchList(List("x", "x"));System.out.println("""res4: String = """ + $show(res$4));$skip(24); val res$5 = 
  matchList(List(1, 2));System.out.println("""res5: String = """ + $show(res$5));$skip(27); val res$6 = 
  matchList(List(1, 2, 3));System.out.println("""res6: String = """ + $show(res$6));$skip(38); val res$7 = 
  matchList("A" :: "B" :: "C" :: Nil);System.out.println("""res7: String = """ + $show(res$7));$skip(30); val res$8 = 
  matchList(List(1, 2, 3, 4));System.out.println("""res8: String = """ + $show(res$8))}
  
}
