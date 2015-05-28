package com.kasured.peuler.p007

import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}

/**
 * @author kasured.
 */
class P007 extends FeatureSpec with Matchers with GivenWhenThen {

  feature("10001th prime") {
    Given(
      """|By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
        |that the 6th prime is 13
      """.stripMargin)

    val nthPrimeFor = 10001
    val nthPrimeNumberIs = 104743

    When(s"Sequential number of prime is $nthPrimeFor")

    Then(s"${nthPrimeFor}th prime number is $nthPrimeNumberIs")

    nthPrime(nthPrimeFor) shouldBe nthPrimeNumberIs

  }

}
