package caseclasses

object S02CaseClasses {
  println("Case Classes")                         //> Case Classes
  
  // Case classes and the constructor pattern
  
  val v = Var("x")                                //> v  : caseclasses.Var = Var(x)
  val l = Lambda(Var("x"), Var("x"))              //> l  : caseclasses.Lambda = Lambda(Var(x),Var(x))
  val a = Apply(l, Var("y"))                      //> a  : caseclasses.Apply = Apply(Lambda(Var(x),Var(x)),Var(y))

  def matchLambda(e: Expr): String = {
  	def agregate(s: String, e: Expr): String = e match {
  		case Var(name)         => name
  		case Lambda(arg, body) =>  s"(L${agregate("", arg)}.${agregate("", body)})"
  		case Apply(fun, expr)   => s"(${agregate("", fun)} ${agregate("", expr)})"
  		// Expr is a sealed class no nead for the wildcard pattern
  	}
  	agregate("", e)
  }                                               //> matchLambda: (e: caseclasses.Expr)String
  
  matchLambda(l)                                  //> res0: String = (Lx.x)
  matchLambda(a)                                  //> res1: String = ((Lx.x) y)
  

  // Sequence patterns
  def matchList(e: List[_]) = e match {
  	case List() => "Empty List"
  	case List(x) => s"List with single element: $x"
  	case List(x, y) if x == y => s"$x two times (Example for pattern guard)"
  	case List(x, y) => s"two elements: $x and $y"
  	case List(x, _, _) => s"Three elemnts, first is $x"
  	case List(head, tail @ _*) => s"At least four elements: $head :: $tail"
  	case _ => "Not expected case (Exaple for the wildcard pattern)"
  }                                               //> matchList: (e: List[_])String
  
  matchList(List())                               //> res2: String = Empty List
  matchList(List("x"))                            //> res3: String = List with single element: x
  matchList(List("x", "x"))                       //> res4: String = x two times (Example for pattern guard)
  matchList(List(1, 2))                           //> res5: String = two elements: 1 and 2
  matchList(List(1, 2, 3))                        //> res6: String = Three elemnts, first is 1
  matchList("A" :: "B" :: "C" :: Nil)             //> res7: String = Three elemnts, first is A
  matchList(List(1, 2, 3, 4))                     //> res8: String = At least four elements: 1 :: List(2, 3, 4)
  
  def matchList2(e: List[_]) = e match {
  	case Nil => "it's Nil"
  	case x :: Nil => "single " + x
  	case head :: tail => s"at least tow element: $head :: $tail"
  }                                               //> matchList2: (e: List[_])String
  
  matchList2(Nil)                                 //> res9: String = it's Nil
  matchList2(List(1))                             //> res10: String = single 1
  matchList2(List("a","b"))                       //> res11: String = at least tow element: a :: List(b)
  matchList2(List(1,2,3))                         //> res12: String = at least tow element: 1 :: List(2, 3)
  
}