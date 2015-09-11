package com.kasured.peuler.p002
object FibEvensSum {
    def main(args: Array[String]) {
        val upperLimit = java.lang.Long.parseLong(args(0))
        println(s"Sum of all even Fib numbers <= $upperLimit = ${fibEvenSum(upperLimit)}")
    }

    //nth Fib number
    def fibEvenSum(limit: Long): Long = {
        if(limit <= 1) {
            0
        } else {
            doFibEvenSum(1, 2, 0, limit)
        }
    }

    @scala.annotation.tailrec
    def doFibEvenSum(prev: Long, curr: Long, sum: Long, limit: Long): Long = {
        if(curr > limit) {
            sum
        } else {
            doFibEvenSum(curr, prev + curr, if((curr & 1) == 0) sum + curr else sum, limit)
        }
    }
}
