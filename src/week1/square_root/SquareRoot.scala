package week1.square_root

/**
  * Example of the Newton's method to calculate the square root of the given number.
  */
object SquareRoot {

  /**
    * Calculates the square root of the given number using Newton's algorithm
    *
    * @param givenValueToCalculateSquareRoot value to calculate the square root of
    * @return the calculated square root of the given value
    */
  def squareRoot(givenValueToCalculateSquareRoot: Double) = algorithmNewton(1.0, givenValueToCalculateSquareRoot)

  private val Epsilon = 1e-10

  private def abs(value: Double) = if (value <= 0) -value else value

  private def isGoodEnough(foundApproximation: Double, givenValueToCalculateSquareRoot: Double) =
    abs(foundApproximation * foundApproximation - givenValueToCalculateSquareRoot) / givenValueToCalculateSquareRoot < Epsilon

  private def improveApproximation(foundApproximation: Double, givenValueToCalculateSquareRoot: Double) =
    (foundApproximation + givenValueToCalculateSquareRoot / foundApproximation) / 2

  private def algorithmNewton(foundApproximation: Double, givenValueToCalculateSquareRoot: Double): Double =
    if (isGoodEnough(foundApproximation, givenValueToCalculateSquareRoot)) foundApproximation
    else {
      val improvedApproximation = improveApproximation(foundApproximation, givenValueToCalculateSquareRoot)
      algorithmNewton(improvedApproximation, givenValueToCalculateSquareRoot)
    }
}
