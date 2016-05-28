package week1.conditional_expressions

/**
  * Created by terance on 28.05.16.
  */
object ConditionalExpressions {
  def abs(x: Int) = if (x >= 0) x else -x

  def and(x: Boolean, y: => Boolean) = if (x) y else false

  def or(x: Boolean, y: => Boolean) = if (!x) y else true
}
