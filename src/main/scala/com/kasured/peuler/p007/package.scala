package com.kasured.peuler
package object p007 {
  def nthPrime(n: Long): Long = {
    @annotation.tailrec
    def step(nn: Long, candidate: Long): Long = isPrime(candidate) match {
      case true if (nn == n) => candidate
      case true => step(nn + 1, candidate + 1)
      case false => step(nn, candidate + 1)
    }
    def isPrime(candidate: Long): Boolean = candidate match {
      case x if x == 2 || x == 3 || x == 5 => true
      case x if (x & 1) == 0 || (x % 3) == 0 => false
      case _ => check(5, math.round(math.sqrt(candidate.toDouble)).toLong, candidate)
    }
    @annotation.tailrec
    def check(_n: Long, limit: Long, candidate: Long): Boolean = {
      if(_n > limit) true else {
        if(candidate % _n == 0 || candidate % (_n + 2) == 0) false else check(_n + 6, limit, candidate)
      }
    }
    step(1, 2)
  }
}