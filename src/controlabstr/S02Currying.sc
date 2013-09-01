package controlabstr

object S02Currying {

	def curriedSum(x:Int)(y: Int) = x + y     //> curriedSum: (x: Int)(y: Int)Int
	curriedSum(4)(6)                          //> res0: Int = 10
	
	// transform to partially apllied function
	val pcs = curriedSum(4)_                  //> pcs  : Int => Int = <function1>
	pcs(6)                                    //> res1: Int = 10

  // take it apart
  def first(x: Int) = (y: Int) => x + y           //> first: (x: Int)Int => Int
  def second = first(4)                           //> second: => Int => Int
  second(6)                                       //> res2: Int = 10
	
}