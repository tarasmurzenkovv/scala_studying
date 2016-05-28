package week1.using_blocks

object ExampleOfUsingBlocks {
  def outerFunction(firstArgument: Int): Double = {
    def innerFunction(firstArgument: Int, secondArgument: Int) = secondArgument + firstArgument
    innerFunction(firstArgument, 2)
  }
}
