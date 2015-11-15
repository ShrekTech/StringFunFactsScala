package com.shrek.categorizer

/**
 * @author shrikkanths
 */
class PalindromeFactEvaluator {
  def getNumberOfPalindromes(words: Array[String]): Integer = {
    return words.count(word => word equals word.reverse)
  }
}