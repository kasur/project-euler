package com.kasured.peuler.p003

object Problem003 {
  def main(args: Array[String]) {
    if(args == null || args.length < 1) {
      println(0)
    } else {
      val n = java.lang.Long.parseLong(args(0), 10)
      println(s"Finding largest prime factor for $n")
      val largestPrimeFactor = largestPrimeFactorFor(n)
      println(s"Largest prime factor for $n is $largestPrimeFactor")
    }
  }

  def largestPrimeFactorFor(n: Long): Long = {
    if(n <= 0) return 0
    if(n == 1 || n == 2) n else {
      //it is important to start with factor 2 as it will allow as to use odd candidates after eliminating factor of 2
      findLargestPrimeFactorFor(2, n, firstFactorFound = false)
    }
  }

  @scala.annotation.tailrec
  def findLargestPrimeFactorFor(candidate: Long, n: Long, firstFactorFound: Boolean): Long = candidate match {
    // first check if we did not find any factor and if the value gte n than stop and return what is left
    case value if !firstFactorFound && value >= n => n
    // if we already found the factor then we can check if the candidate ^ 2 is greater than current n
    // here we use the fact that p1 * ... * pk = N and that if p1 != 1 => pk should be less than sqrt(N/p1)
    case value if firstFactorFound && value * value > n => n
    // if candidate divides n than n = n / candidate and use the same candidate to eliminate power of it
    case value if n % value == 0 => findLargestPrimeFactorFor(candidate, n / candidate, firstFactorFound = true)
    //otherwise increase the candidate by step so that the new one will be odd
    case value => findLargestPrimeFactorFor(candidate + 1 + (candidate & 1), n, firstFactorFound)
  }
}
