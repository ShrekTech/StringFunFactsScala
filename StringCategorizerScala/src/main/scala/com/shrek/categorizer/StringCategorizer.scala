package com.shrek.categorizer

object StringCategorizer {

  def main(args: Array[String]) {
    val charactersFromTextEntered: Array[Char] = args.flatMap { _.toCharArray() }

    val vowelFactEvaluator = new VowelFactEvaluator
    val capitalLetterFactEvaluator = new CapitalLetterFactEvaluator
    val palindromeFactEvaluator = new PalindromeFactEvaluator

    val numberOfVowels = vowelFactEvaluator.getNumberOfVowels(charactersFromTextEntered)
    val wordsWithVowelsPrintString = vowelFactEvaluator.getWordsWithVowels(args)
    val numberOfConsonants = vowelFactEvaluator.getNumberOfConsonants(charactersFromTextEntered)
    val wordsWithConsonantsPrintString = vowelFactEvaluator.getWordsWithConsonants(args)

    val numberOfCapitalLetters = capitalLetterFactEvaluator.getNumberOfCapitalLetters(charactersFromTextEntered)
    val numberOfWordsStartingWithCapitalLetter = capitalLetterFactEvaluator.getNumberOfWordsStartingWithCapitalLetter(args)

    val numberOfPalindromes = palindromeFactEvaluator.getNumberOfPalindromes(args)

    println("The number of vowels in your input string is: " + numberOfVowels)
    println("The words with vowels in your input string are: " + wordsWithVowelsPrintString)
    println("The number of consonants in your input string is:" + numberOfConsonants)
    println("The words with consonants in your input string are: " + wordsWithConsonantsPrintString)
    println("The number of capital letters in your input string is: " + numberOfCapitalLetters)
    println("The number of words starting with a capital letter in your input string is: " + numberOfWordsStartingWithCapitalLetter)
    println("The number of words that are palindromes in your input string are: " + numberOfPalindromes)
  }

}