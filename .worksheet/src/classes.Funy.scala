package classes

class Funy(val i: Double) {
  def +*(other: Funy) = new Funy(this.i + other.i)
  def **(other: Funy) = new Funy(this.i * other.i)
  def *=(other: Funy) = new Funy(this.i * other.i)
  def */(other: Funy) = new Funy(this.i / other.i)
  def *:(other: Funy) = new Funy(this.i / other.i)
  override def toString = s"Funy($i)"
}

object Funy {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(407); 
  implicit def doubleToFuny(d: Double) = new Funy(d);System.out.println("""doubleToFuny: (d: Double)classes.Funy""");$skip(36); 
	def apply(d: Double) = new Funy(d);System.out.println("""apply: (d: Double)classes.Funy""")}
}

object S03Operators {

  println("Operators")
  
  // infix
  
  1 + 2
  
  1 + 2 == 1.+(2)
  
  val s = "Sors bona nilhil aliud!"
  
  s indexOf ('o', 3) == s.indexOf('o', 3)
  
  // prefix  +-!~
  
  val d = -2.0
  
  (-2.0) == ((2.0).unary_-) == ((2.0) unary_-)
  
  // postfix
  
  s.toLowerCase == (s toLowerCase)
  
  // equality
  
  List(1, 2, 3) == List(1, 2, 3)
  
  null == List(5, 6)
  List(7, 8) == null
  null == null
  
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
  
  new Funy(1) +* new Funy(2) ** new Funy(9)
  Funy(1) +* Funy(2) *= Funy(9)
  
  val eight = new Funy(8.0)
  val four =new  Funy(4.0)
  eight */ four
  eight */ four == eight.*/(four)
  eight *: four
  eight *: four == four.*:(eight)
}
