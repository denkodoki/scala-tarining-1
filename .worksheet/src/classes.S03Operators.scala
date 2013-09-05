package classes

object S03Operators {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 

  println("Operators");$skip(27); val res$0 = 
  
  // infix
  
  1 + 2;System.out.println("""res0: Int(3) = """ + $show(res$0));$skip(22); val res$1 = 
  
  1 + 2 == 1.+(2);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(39); 
  
  val s = "Sors bona nihil aliud!";System.out.println("""s  : String = """ + $show(s ));$skip(46); val res$2 = 
  
  s indexOf ('o', 3) == s.indexOf('o', 3);System.out.println("""res2: Int = """ + $show(res$2));$skip(41); 
  
  // prefix  +-!~
  
  val d = -2.0;System.out.println("""d  : Double = """ + $show(d ));$skip(51); val res$3 = 
  
  (-2.0) == ((2.0).unary_-) == ((2.0) unary_-);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(56); val res$4 = 
  
  // postfix
  
  s.toLowerCase == (s toLowerCase);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(55); val res$5 = 
  
  // equality
  
  List(1, 2, 3) == List(1, 2, 3);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(25); val res$6 = 
  
  null == List(5, 6);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(21); val res$7 = 
  List(7, 8) == null;System.out.println("""res7: Boolean = """ + $show(res$7));$skip(15); val res$8 = 
  null == null;System.out.println("""res8: Boolean = """ + $show(res$8));$skip(214); 
  
  // operators precedence
  
  // (all other special characters)
  // *
  // / %
  // + -:
  // = !
  // < >
  // &
  // ?
  // |
  // (all letters)
  // (all assignment operators)
  
  val one = new Funy(1);System.out.println("""one  : classes.Funy = """ + $show(one ));$skip(24); 
  val two = new Funy(2);System.out.println("""two  : classes.Funy = """ + $show(two ));$skip(25); 
  val nine = new Funy(9);System.out.println("""nine  : classes.Funy = """ + $show(nine ));$skip(21); val res$9 = 
  one +* two ** nine;System.out.println("""res9: classes.Funy = """ + $show(res$9));$skip(21); val res$10 = 
  one +* two *= nine;System.out.println("""res10: classes.Funy = """ + $show(res$10));$skip(32); 
  
  val eight = new Funy(8.0);System.out.println("""eight  : classes.Funy = """ + $show(eight ));$skip(27); 
  val four =new  Funy(4.0);System.out.println("""four  : classes.Funy = """ + $show(four ));$skip(16); val res$11 = 
  eight */ four;System.out.println("""res11: classes.Funy = """ + $show(res$11));$skip(34); val res$12 = 
  eight */ four == eight.*/(four);System.out.println("""res12: Boolean = """ + $show(res$12));$skip(16); val res$13 = 
  eight *: four;System.out.println("""res13: classes.Funy = """ + $show(res$13));$skip(34); val res$14 = 
  eight *: four == four.*:(eight);System.out.println("""res14: Boolean = """ + $show(res$14))}
}

class Funy(val i: Double) {
  def +*(other: Funy) = new Funy(this.i + other.i)
  def **(other: Funy) = new Funy(this.i * other.i)
  def *=(other: Funy) = new Funy(this.i * other.i)
  def */(other: Funy) = new Funy(this.i / other.i)
  def *:(other: Funy) = new Funy(this.i / other.i)
  override def toString = s"Funy($i)"
}
