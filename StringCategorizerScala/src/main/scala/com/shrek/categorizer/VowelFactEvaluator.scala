package com.shrek.categorizer

class VowelFactEvaluator {
  val vowels = List("a", "e", "i", "u", "o")
  def isVowel(character: Char) = {
    vowels.contains(character.toString())
  }

  def getNumberOfVowels(charactersFromTextEntered: Array[Char]): Integer = {
    return charactersFromTextEntered.count(
      character => (isVowel(character)))
  }

  def getWordsWithVowels(words: Array[String]): String = {
    return words.filter(word =>
      word.toCharArray().count(
        character => isVowel(character)) > 0).reduceRight((wordWithVowels, wordsWithVowels) => (wordsWithVowels + ". ") + wordWithVowels).trim()

  }

  def getNumberOfConsonants(charactersFromTextEntered: Array[Char]): Integer = {
    return charactersFromTextEntered.count(
      character => (!isVowel(character)))
  }

  def getWordsWithConsonants(words: Array[String]): String = {
    return words.filter(word =>
      word.map { char => char }.count(
        character => !isVowel(character)) > 0).reduceRight((wordWithConsonants, wordsWithConsonants) => (wordsWithConsonants + ". ") + wordWithConsonants).trim()

  }

}