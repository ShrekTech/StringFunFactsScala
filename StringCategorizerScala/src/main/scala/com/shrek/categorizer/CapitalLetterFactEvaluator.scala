package com.shrek.categorizer

/**
 * @author shrikkanths
 */
class CapitalLetterFactEvaluator {
  def getNumberOfCapitalLetters(charactersFromTextEntered: Array[Char]) : Integer = {
    return charactersFromTextEntered.count(
      character => character.isUpper)
  }

  def getNumberOfWordsStartingWithCapitalLetter(words: Array[String]): Integer = {
    return words.count { word => word.charAt(0).isUpper }
  }
}