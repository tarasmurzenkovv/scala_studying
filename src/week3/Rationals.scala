package week3

class Rationals(numerator: Int, denominator: Int) {
  private def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)

  private val computedGcd = gcd(numerator, denominator)

  val x = numerator / computedGcd
  val y = denominator / computedGcd

  override def toString = x + "/" + y
}
