package week1

object session {
  1 + 2                                           //> res0: Int(3) = 3
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
  abs(-1)                                         //> res1: Double = 1.0
  abs(1)                                          //> res2: Double = 1.0
  abs(0)                                          //> res3: Double = 0.0

  def sqrt(x: Double): Double = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs((guess * guess) - x) / x < 0.000001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double

  def factorial(n: Int) = {
    def factorialIter(n: Int, total: Int): Int = {
      if (n == 0)
        total
      else
        factorialIter(n - 1, total * n)
    }
    factorialIter(n, 1)
  }                                               //> factorial: (n: Int)Int

  factorial(2)                                    //> res4: Int = 2
  factorial(3)                                    //> res5: Int = 6
  factorial(4)                                    //> res6: Int = 24
  factorial(9)                                    //> res7: Int = 362880

  sqrt(2)                                         //> res8: Double = 1.4142135623746899
  sqrt(4)                                         //> res9: Double = 2.0000000929222947
  sqrt(9)                                         //> res10: Double = 3.000000001396984
  sqrt(1e-6)                                      //> res11: Double = 0.0010000001533016628
  sqrt(1e60)                                      //> res12: Double = 1.0000000031080746E30
  sqrt(.1e-20)                                    //> res13: Double = 3.1622778383672726E-11
  sqrt(1e20)                                      //> res14: Double = 1.0000000000023079E10
  sqrt(1e50)                                      //> res15: Double = 1.0000003807575104E25

}