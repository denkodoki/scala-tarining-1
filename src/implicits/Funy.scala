package implicits

class Funy(val d: Double) {
  def ++ (other: Funy) = new Funy(this.d + other.d)
  def ** (other: Funy) = new Funy(this.d * other.d)
  def stringPair(that: Funy)(implicit s: String) = this + s + that
  override def toString = s"Funy($d)"
}

object Funy {
  implicit val s = ", "
  implicit def doubleToFuny(d: Double) = new Funy(d)
  def apply(d: Double) = new Funy(d)
}

