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
  def countChange(money: Int, coins: List[Int]): Int = {
    
    def countChangeLoop(money: Int, coins: List[Int]): Int = {
      if ( coins.isEmpty && money == 0 )
        1
      else if ( coins.isEmpty && money != 0 )
        0
      else if ( coins.head > money )
        countChangeLoop(money, coins.tail) //only option is to move on to next coin
      else
        //count both the use of the current coin, and also all the options of skipping this coin 
        countChangeLoop(money-coins.head,coins) + countChangeLoop(money,coins.tail) 
    }
    
    countChangeLoop(money, coins.sorted(Ordering[Int].reverse)) 
  }
}
