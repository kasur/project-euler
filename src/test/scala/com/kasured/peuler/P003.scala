package com.kasured.peuler

import com.kasured.peuler.p003.Problem003
import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

/**
  * @author kasured.
  */
class P003 extends FeatureSpec with Matchers with GivenWhenThen {

   feature("Problem 003") {
     Given(
       """The prime factors of 13195 are 5, 7, 13 and 29.
         |
         |What is the largest prime factor of the number 600851475143 ?
       """.stripMargin)

     val number = 600851475143L
     val maxPrimeFactor = 6857

     When(s"the given number is $number")

     Then(s"Max prime factor is $maxPrimeFactor")

     Problem003.largestPrimeFactorFor(number) shouldBe maxPrimeFactor

   }

 }
