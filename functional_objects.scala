
class Rational(n: Int, d: Int) {
  def this(n: Int) = this(n, 1) // auxilary constructor

  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n/g // make them fields so we can access them
  val denom: Int = d/g // from other object (in add function)

  override def toString = f"${numer}/${denom}"

  def add(that: Rational): Rational =
    new Rational(
      numer*that.denom + that.numer*denom,
      denom*that.denom
    )

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)

  def - (that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def * (i: Int): Rational =
    new Rational(numer * i, denom)

  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def / (i: Int): Rational =
    new Rational(numer, denom * i)

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this.lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

implicit def intToRational(x: Int) = new Rational(x)
