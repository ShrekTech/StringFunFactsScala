package com.shrek.categorizer

import org.junit.runner.RunWith
import org.scalatest.{ Matchers, FlatSpec }
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class VowelFactEvaluatorTest extends FlatSpec with Matchers {
  val vowelFactEvaluator = new VowelFactEvaluator

  behavior of "VowelFactEvaluator getNumberOfVowels"

  it should "return the correct number of 'a' for a given array of characters" in {
    val characterArrayWith3As = Array('a', 'a', 'a')
    val numberOfVowels = vowelFactEvaluator.getNumberOfVowels(characterArrayWith3As);
    assert(numberOfVowels == 3)
  }
}