package week1.evaluation_strategies

/**
  * The example you have given only uses call-by-value, so I will give a new, simpler, example that shows the difference.
  * *
  * First, let's assume we have a function with a side-effect. This function prints something out and then returns an Int.
  * *
  * def something() = {
  * println("calling something")
  * 1 // return value
  * }
  * Now we are going to define two function that accept Int arguments that are exactly the same except that one takes the
  * argument in a call-by-value style (x: Int) and the other in a call-by-name style (x: => Int).
  * *
  * def callByValue(x: Int) = {
  * println("x1=" + x)
  * println("x2=" + x)
  * }
  * *
  * def callByName(x: => Int) = {
  * println("x1=" + x)
  * println("x2=" + x)
  * }
  * Now what happens when we call them with our side-effecting function?
  * *
  * scala> callByValue(something())
  * calling something
  * x1=1
  * x2=1
  * *
  * scala> callByName(something())
  * calling something
  * x1=1
  * calling something
  * x2=1
  * So you can see that in the call-by-value version, the side-effect of the passed-in function call (something()) only
  * happened once. However, in the call-by-name version, the side-effect happened twice.
  * *
  * This is because call-by-value functions compute the passed-in expression's value before calling the function,
  * thus the same value is accessed every time. However, call-by-name functions recompute the passed-in expression's value
  * every time it is accessed.
  *
  *
  */
object EvaluationStrategies {
  def callByValue(x: Int, y: Int) = x + y

  def callByName(y: Int, x: => Int) = y + x
}
