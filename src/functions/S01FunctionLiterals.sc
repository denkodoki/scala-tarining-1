package functions

object S01FunctionLiterals {

  
	val incr = (x: Int) => x + 1              //> incr  : Int => Int = <function1>
	incr(2)                                   //> res0: Int = 3
	
	val pr = (a: String, i: Int, f: Int => Int) => {
		println(a)
		println(f(i))
	}                                         //> pr  : (String, Int, Int => Int) => Unit = <function3>
	
	pr("Increment by one", 3, incr)           //> Increment by one
                                                  //| 4
	pr("Make it double", 10, (x: Int) => x * 2)
                                                  //> Make it double
                                                  //| 20
	pr("Squere", 5, x => x * x)               //> Squere
                                                  //| 25
	pr("Make if half", 8, _ / 2)              //> Make if half
                                                  //| 4
	
                                                  
}