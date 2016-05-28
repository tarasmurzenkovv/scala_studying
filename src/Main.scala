import week1.square_root.SquareRoot.squareRoot
import week2.ReducingArrayOfVariables

/**
  * Created by terance on 28.05.16.
  */
object Main {
  def main(args: Array[String]): Unit = {
    def identity(x: Int): Int = x
    println(ReducingArrayOfVariables.product(identity, 1, 3))
    println(ReducingArrayOfVariables.product1(identity)(1, 3))
    println(ReducingArrayOfVariables.mapReduce(x => x, (x, y) => x + y, 0)(1, 3))
  }
}
