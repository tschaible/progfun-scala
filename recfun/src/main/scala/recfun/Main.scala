package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c > r) throw new IllegalArgumentException("Invalid Pascal Triangle Position")
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceLoop(chars: List[Char], balance: Int): Boolean = {
      if (balance < 0) // return false immediately, if unbalanced with too many )
        false
      else if (chars.isEmpty) //at end, simple check to ensure balance was maintained
        balance == 0
      else if (chars.head == '(')
        balanceLoop(chars.tail, balance + 1) //indicate one ( needs balancing
      else if (chars.head == ')')
        balanceLoop(chars.tail, balance - 1) //indicate one ) has closed a (
      else
        balanceLoop(chars.tail, balance) //move to next character
    }

    balanceLoop(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
