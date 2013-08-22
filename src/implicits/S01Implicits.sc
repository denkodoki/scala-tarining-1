package implicits

object S01Implicits {

  println("Implicits")                            //> Implicits
  
  val f: Funy = 1                                 //> f  : implicits.Funy = Funy(1.0)
  
  Funy(1) ++ 2.0                                  //> res0: implicits.Funy = Funy(3.0)
  
  import Funy._
  
  1 ++ 2                                          //> res1: implicits.Funy = Funy(3.0)
  Funy(1).stringPair(Funy(2))                     //> res2: String = Funy(1.0), Funy(2.0)
  
}