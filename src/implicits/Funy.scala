package implicits

class Funy(val d: Double) {
  def ++ (other: Funy) = new Funy(this.d + other.d)
  def ** (other: Funy) = new Funy(this.d * other.d)
  def stringPair(that: Funy)(implicit separator: String) = this + separator + that
  override def toString = s"Funy($d)"
}

object Funy {
  implicit val separator = ", "
  implicit def doubleToFuny(d: Double) = new Funy(d)
  def apply(d: Double) = new Funy(d)
  def unapply(f: Funy): Option[Double] = Some(f.d)
}
