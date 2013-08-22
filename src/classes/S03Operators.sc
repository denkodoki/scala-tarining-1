package classes

object S03Operators {

  println("Operators")                            //> Operators
  
  // infix
  
  1 + 2                                           //> res0: Int(3) = 3
  
  1 + 2 == 1.+(2)                                 //> res1: Boolean = true
  
  val s = "Sors bona nilhil aliud!"               //> s  : String = Sors bona nilhil aliud!
  
  s indexOf ('o', 3) == s.indexOf('o', 3)         //> res2: Int = -1
  
  // prefix  +-!~
  
  val d = -2.0                                    //> d  : Double = -2.0
  
  (-2.0) == ((2.0).unary_-) == ((2.0) unary_-)    //> res3: Boolean = false
  
  // postfix
  
  s.toLowerCase == (s toLowerCase)                //> res4: Boolean = true
  
  // equality
  
  List(1, 2, 3) == List(1, 2, 3)                  //> res5: Boolean = true
  
  null == List(5, 6)                              //> res6: Boolean = false
  List(7, 8) == null                              //> res7: Boolean = false
  null == null                                    //> res8: Boolean = true
  
  // operators precedence
  
  // (all other special characters)
  // *
  // / %
  // + -:
  // = !
  // < >
  // &
  // ˆ
  // |
  // (all letters)
  // (all assignment operators)
  
  val one = new Funy(1)                           //> one  : classes.Funy = Funy(1.0)
  val two = new Funy(2)                           //> two  : classes.Funy = Funy(2.0)
  val nine = new Funy(9)                          //> nine  : classes.Funy = Funy(9.0)
  one +* two ** nine                              //> res9: classes.Funy = Funy(19.0)
  one +* two *= nine                              //> res10: classes.Funy = Funy(27.0)
  
  val eight = new Funy(8.0)                       //> eight  : classes.Funy = Funy(8.0)
  val four =new  Funy(4.0)                        //> four  : classes.Funy = Funy(4.0)
  eight */ four                                   //> res11: classes.Funy = Funy(2.0)
  eight */ four == eight.*/(four)                 //> res12: Boolean = false
  eight *: four                                   //> res13: classes.Funy = Funy(0.5)
  eight *: four == four.*:(eight)                 //> res14: Boolean = false
}

class Funy(val i: Double) {
  def +*(other: Funy) = new Funy(this.i + other.i)
  def **(other: Funy) = new Funy(this.i * other.i)
  def *=(other: Funy) = new Funy(this.i * other.i)
  def */(other: Funy) = new Funy(this.i / other.i)
  def *:(other: Funy) = new Funy(this.i / other.i)
  override def toString = s"Funy($i)"
}