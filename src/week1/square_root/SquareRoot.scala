package week1.square_root

/**
  * Created by terance on 28.05.16.
  */
object SquareRoot {

  val Epsilon = 1e-10

  def abs(value: Double) = if (value <= 0) -value else value

  def isGoodEnough(foundApproximation: Double, givenValueToCalculateSquareRoot: Double) =
    abs(foundApproximation * foundApproximation - givenValueToCalculateSquareRoot) / givenValueToCalculateSquareRoot < Epsilon

  def improveApproximation(foundApproximation: Double, givenValueToCalculateSquareRoot: Double) =
    (foundApproximation + givenValueToCalculateSquareRoot / foundApproximation) / 2

  def algorithmNewton(foundApproximation: Double, givenValueToCalculateSquareRoot: Double): Double =
    if (isGoodEnough(foundApproximation, givenValueToCalculateSquareRoot)) foundApproximation
    else {
      val improvedApproximation = improveApproximation(foundApproximation, givenValueToCalculateSquareRoot)
      algorithmNewton(improvedApproximation, givenValueToCalculateSquareRoot)
    }

  def squareRoot(x: Double) = algorithmNewton(1.0, x)
}
