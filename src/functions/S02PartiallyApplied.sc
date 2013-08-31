package functions

object S02PartiallyApplied {

  println("Pertially applied functions")          //> Pertially applied functions
  
  def add(a: Double, b: Double): Double = a + b   //> add: (a: Double, b: Double)Double
  
  val add2 = add _                                //> add2  : (Double, Double) => Double = <function2>
  
  add2(3,7)                                       //> res0: Double = 10.0
  
  val add3= add(3, _: Int)                        //> add3  : Int => Double = <function1>
  
  add3(7)                                         //> res1: Double = 10.0
  
  val add4 = add(_: Int, 7)                       //> add4  : Int => Double = <function1>
  add4(3)                                         //> res2: Double = 10.0
}