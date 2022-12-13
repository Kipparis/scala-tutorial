
class Rational(n: Int, d: Int) {
  def this(n: Int) = this(n, 1) // auxilary constructor

  require(d != 0)
  val numer: Int = n // make them fields so we can access them
  val denom: Int = d // from other object (in add function)

  override def toString = f"${numer}/${denom}"

  def add(that: Rational): Rational =
    new Rational(
      numer*that.denom + that.numer*denom,
      denom*that.denom
    )

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this.lessThan(that)) that else this
}

// stopped at closed fields and methods
