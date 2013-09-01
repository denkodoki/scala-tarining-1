package functions

object S04SpecialCalls {
  println("Special function calls")               //> Special function calls

  /*
   Repeated parameters
   */
  def echo(args: String*) = args foreach println  //> echo: (args: String*)Unit
  echo("AC", "DC")                                //> AC
                                                  //| DC

  val acdc = Array("AC", "DC")                    //> acdc  : Array[String] = Array(AC, DC)
  //? echo(acdc)

  /*
   Named parameters
   */
  def speed(distance: Double, time: Double) = distance / time
                                                  //> speed: (distance: Double, time: Double)Double
  speed(time = 45, distance = 100)                //> res0: Double = 2.2222222222222223
  speed(100, time = 45)                           //> res1: Double = 2.2222222222222223
  //? speed(time = 45, 100)

  /*
   Default parameter values
   */
  def rate(amount: Int = 100, price: Int = 100): Double = price.toDouble / amount
                                                  //> rate: (amount: Int, price: Int)Double
  rate()                                          //> res2: Double = 1.0
  rate(price = 80)                                //> res3: Double = 0.8

  /*
   Tail recursion
   */

  def boom(x: Int): Int =
    if (x == 0) throw new Exception("boom!")
    else boom(x - 1) + 1                          //> boom: (x: Int)Int
    // not tail recusive: the recursive call is not the last action
    
    

  def bang(x: Int): Int =
    if (x == 0) throw new Exception("bang!")
    else bang(x - 1)                              //> bang: (x: Int)Int
    // the recursive call is he last action
    
 // boom(3)
 // bang(3)

}