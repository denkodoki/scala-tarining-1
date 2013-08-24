package implicits

object S01Implicits {

  println("Implicits")                            //> Implicits
  
  /*
   *  In the below section implicit conversion functions are found in the companion object Funy
   */
  
  // Conversion to the expected type
  // Int -> Double -> Funy
  
  val i = 1                                       //> i  : Int = 1
  val f: Funy = i                                 //> f  : implicits.Funy = Funy(1.0)
  
  // Parameter conversion
  // 2.0 is implicitli converted to Funy
  
  Funy(1) ++ 2.0                                  //> res0: implicits.Funy = Funy(3.0)
  
  /*
   *  In the below section implicit conversion functions are availabe because of import
   */
  
  import Funy._
  
  // Conversion of the receiver
  // method ++ applied on the result of implicit conversions: Int -> Double -> Funy
  
  1 ++ 2                                          //> res1: implicits.Funy = Funy(3.0)
  
  // Implicit parameter
  // separator parameter can be implicitlly defined
  
  Funy(1).stringPair(Funy(2))(" : ")              //> res2: String = Funy(1.0) : Funy(2.0)
  Funy(1).stringPair(Funy(2))                     //> res3: String = Funy(1.0), Funy(2.0)

  /*
   *  In the below section the implicit conversion function is defined in place
   */
   
  implicit def funyToOrdered(f: Funy): Ordered[Funy] = new Ordered[Funy] {
    def compare(that: Funy): Int = (f.d - that.d).toInt
  }                                               //> funyToOrdered: (f: implicits.Funy)Ordered[implicits.Funy]
   

  // View bounds

  def maxList[T](elements: List[T])(implicit orderer: T => Ordered[T]): T =
    elements match {
      case List() =>
        throw new IllegalArgumentException("empty list!")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxList(rest) // (orderer) is implicit
        if (x > maxRest) x // orderer(x) is implicit
        else maxRest
  }                                               //> maxList: [T](elements: List[T])(implicit orderer: T => Ordered[T])T
    
  val fl = List(Funy(3), Funy(1), Funy(11), Funy(7))
                                                  //> fl  : List[implicits.Funy] = List(Funy(3.0), Funy(1.0), Funy(11.0), Funy(7.
                                                  //| 0))
  
  maxList(fl)                                     //> res4: implicits.Funy = Funy(11.0)

  // A View Bound is applied instead of impicit parameter definition
  def maxList2[T <% Ordered[T]](elements: List[T]): T =
    elements match {
      case List() =>
        throw new IllegalArgumentException("empty list!")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxList2(rest) // (orderer) is implicit
        if (x > maxRest) x // orderer(x) is implicit
        else maxRest
  }                                               //> maxList2: [T](elements: List[T])(implicit evidence$1: T => Ordered[T])T
  
  maxList2(fl)                                    //> res5: implicits.Funy = Funy(11.0)

}