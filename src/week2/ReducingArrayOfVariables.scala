package week2

object ReducingArrayOfVariables {
  /**
    * Applies the given function for each int in the given interval and then sums them.
    *
    * @param reductionFunction - function to apply for each int in the given interval
    * @param from              starting value of the interval
    * @param to                - ending value of the interval
    * @return sum or zero when from is greater than to
    */
  def sum(reductionFunction: Int => Int, from: Int, to: Int): Int =
    if (from > to) 0
    else reductionFunction(from) + sum(reductionFunction, from + 1, to)

  def cube(toCube: Int) = toCube * toCube * toCube

  def product(reductionFunction: Int => Int, from: Int, to: Int): Int =
    if (from > to) 1
    else reductionFunction(from) * product(reductionFunction, from + 1, to)

  def product1(reductionFunction: Int => Int)(from: Int, to: Int): Int =
    if (from > to) 1
    else reductionFunction(from) * product1(reductionFunction)(from + 1, to)

  def mapReduce(mappingFunction: Int => Int, reductionFunction: (Int, Int) => Int, unitValue: Int)(from: Int, to: Int): Int =
    if (from > to) unitValue
    else reductionFunction(mappingFunction(from), mapReduce(mappingFunction, reductionFunction, unitValue)(from + 1, to))
}
