package basic

object S02DefineVariables {

  // define variables
  
	val s = "Hi"                              //> s  : String = Hi
	val i = 10                                //> i  : Int = 10
   
  var n: Int = 3                                  //> n  : Int = 3
  n = 5
  n                                               //> res0: Int = 5
  
  // semicolon infrence
  
  val x = 1; val y = 23                           //> x  : Int = 1
                                                  //| y  : Int = 23
  x + 1                                           //> res1: Int = 2
  x +
  1                                               //> res2: Int = 2
  x                                               //> res3: Int = 1
  +1                                              //> res4: Int = 1
  (x
  + 1)                                            //> res5: Int = 2
}