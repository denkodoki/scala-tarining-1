package functions

object S03Closusres {

  println("Closures and free variables")          //> Closures and free variables
  
  var delta = 1;                                  //> delta  : Int = 1
  val increment = (i: Int) => i + delta // delta is a free variable
                                                  //> increment  : Int => Int = <function1>
  
  increment(12)                                   //> res0: Int = 13
  delta = 2
  increment(12)                                   //> res1: Int = 14
  
  var sum = 0;                                    //> sum  : Int = 0
  (1 to 10).foreach(sum += _)
  sum                                             //> res2: Int = 55
  
  
  def makeInreaser(delta: Int) = (i: Int) => i + delta
                                                  //> makeInreaser: (delta: Int)Int => Int
                                                  
  val inc10 = makeInreaser(10)                    //> inc10  : Int => Int = <function1>
  val inc100 = makeInreaser(100)                  //> inc100  : Int => Int = <function1>
  
  inc10(10)                                       //> res3: Int = 20
  inc100(10)                                      //> res4: Int = 110
  
  
}