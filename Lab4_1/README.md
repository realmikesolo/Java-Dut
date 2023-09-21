# Java Laboratory Work №4.1: Palindrome Checker

This repository contains a simple implementation to check if a given word or phrase is a palindrome using Java strings. A palindrome is a word, phrase, or sequence of characters which reads the same backward as forward, disregarding spaces, punctuation, and capitalization.

## Steps:

### Implementing the Palindrome Check Function (isPalindrome):

- Defined within the Palindrome class.
- The function first removes spaces from the input string and converts it to lowercase for consistency.
- Then, it checks if the string reads the same forward and backward.
- If the string is a palindrome, it returns true, otherwise false.

### Demonstrating the Function in the Main Class:

- Instantiated the Palindrome class.
- Checked if the string is a palindrome and printed the result.

### Testing the Palindrome Check Function with PalindromeTest:

- testIsPalindrome(): Checks standard palindrome scenarios like "radar", "Racecar", and "A man a plan a canal Panama". It also ensures non-palindromes like "hello" and "OpenAI" are detected.
- testIsPalindromeWithSpaces(): Verifies the function's ability to correctly ignore spaces by using examples like "A man a plan a canal Panama" and " radar ".
- testIsPalindromeEmptyString(): Confirms the function correctly handles an empty string, which should be considered a palindrome.