package basic

object S02DefineVariables {

  // define variables
  
	val s: String = "Hi"                      //> s  : String = Hi
   
  var n: Int = 3                                  //> n  : Int = 3
  
  // semicolon infrence
  
  val x = 1; val y = 23                           //> x  : Int = 1
                                                  //| y  : Int = 23
  x + 1                                           //> res0: Int = 2
  x                                               //> res1: Int = 1
  +1                                              //> res2: Int = 1
  (x
  + 1)                                            //> res3: Int = 2
}