package caseclasses

object S01PatternMatching {

  println("Pattern matching")                     //> Pattern matching

  // Constant patterns and the wildcard pattern

  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else" // wildcard
  }                                               //> describe: (x: Any)String

  describe((1, 2))                                //> res0: String = something else

  import math.{ E, Pi }

  E                                               //> res1: Double = 2.718281828459045
  Pi                                              //> res2: Double = 3.141592653589793

  E match {
    case Pi => "strange math? Pi = " + Pi
    case _ => "OK"
  }                                               //> res3: String = OK

  // Variable pattern

  val expr: Any = List(1, 2)                      //> expr  : Any = List(1, 2)
  expr match {
    case 0 => "zero"
    case somethingElse => "not zero: " + somethingElse
  }                                               //> res4: String = not zero: List(1, 2)

  // Varibale or constant?

  val pi = Pi                                     //> pi  : Double = 3.141592653589793
  E match {
    case pi => "strange math? Pi = " + Pi
    case _ => "OK"
  }                                               //> res5: String = strange math? Pi = 3.141592653589793
  
}