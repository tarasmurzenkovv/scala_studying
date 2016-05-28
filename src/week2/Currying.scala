package week2

object Currying {
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = if (a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }

  // applying
  def shorterVersionOfSum(f: Int => Int)(from: Int, to: Int): Int = if (from > to) 0 else shorterVersionOfSum(f)(from + 1, to)
}
