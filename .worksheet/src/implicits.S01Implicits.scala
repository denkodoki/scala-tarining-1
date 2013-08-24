package implicits

object S01Implicits {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 

  println("Implicits");$skip(192); 
  
  /*
   *  In the below section implicit conversion functions are found in the companion object Funy
   */
  
  // Conversion to the expected type
  // Int -> Double -> Funy
  
  val i = 1;System.out.println("""i  : Int = """ + $show(i ));$skip(18); 
  val f: Funy = i;System.out.println("""f  : implicits.Funy = """ + $show(f ));$skip(90); val res$0 = 
  
  // Parameter conversion
  // 2.0 is implicitli converted to Funy
  
  Funy(1) ++ 2.0
  
  /*
   *  In the below section implicit conversion functions are availabe because of import
   */
  
  import Funy._;System.out.println("""res0: implicits.Funy = """ + $show(res$0));$skip(253); val res$1 = 
  
  // Conversion of the receiver
  // method ++ applied on the result of implicit conversions: Int -> Double -> Funy
  
  1 ++ 2;System.out.println("""res1: implicits.Funy = """ + $show(res$1));$skip(119); val res$2 = 
  
  // Implicit parameter
  // separator parameter can be implicitlly defined
  
  Funy(1).stringPair(Funy(2))(" : ");System.out.println("""res2: String = """ + $show(res$2));$skip(30); val res$3 = 
  Funy(1).stringPair(Funy(2));System.out.println("""res3: String = """ + $show(res$3));$skip(232); 

  /*
   *  In the below section the implicit conversion function is defined in place
   */
   
  implicit def funyToOrdered(f: Funy): Ordered[Funy] = new Ordered[Funy] {
    def compare(that: Funy): Int = (f.d - that.d).toInt
  };System.out.println("""funyToOrdered: (f: implicits.Funy)Ordered[implicits.Funy]""");$skip(387); 
   

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
  };System.out.println("""maxList: [T](elements: List[T])(implicit orderer: T => Ordered[T])T""");$skip(58); 
    
  val fl = List(Funy(3), Funy(1), Funy(11), Funy(7));System.out.println("""fl  : List[implicits.Funy] = """ + $show(fl ));$skip(17); val res$4 = 
  
  maxList(fl);System.out.println("""res4: implicits.Funy = """ + $show(res$4));$skip(414); 

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
  };System.out.println("""maxList2: [T](elements: List[T])(implicit evidence$1: T => Ordered[T])T""");$skip(18); val res$5 = 
  
  maxList2(fl);System.out.println("""res5: implicits.Funy = """ + $show(res$5))}

}
