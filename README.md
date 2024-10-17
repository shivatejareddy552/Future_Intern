
# Basic Calculator

This is a simple console-based calculator program written in Java. It allows the user to perform basic arithmetic operations including addition, subtraction, multiplication, and division. The calculator takes two numbers as input along with an operator and returns the result of the operation.

## Key Features
- **Addition**: Adds two numbers.
- **Subtraction**: Subtracts the second number from the first.
- **Multiplication**: Multiplies two numbers.
- **Division**: Divides the first number by the second, with error handling for division by zero.

## Program Flow
1. The user is prompted to enter the first number.
2. The user selects an arithmetic operator (`+`, `-`, `*`, `/`).
3. The user is prompted to enter the second number.
4. The program performs the calculation based on the operator provided.
5. The result is displayed to the user.
6. If the user tries to divide by zero or enters an invalid operator, the program displays an appropriate error message.

## Error Handling
- **Division by zero**: If the user attempts to divide by zero, the program will detect this and print an error message instead of crashing.
- **Invalid operators**: If the user enters an operator other than `+`, `-`, `*`, or `/`, an error message will be displayed.

## Purpose
This project serves as a beginner-friendly example of a simple calculator in Java. It demonstrates basic concepts such as user input, control structures (`switch` statement), and basic error handling.


# Number Guessing Game

The Number Guessing Game is a simple console-based Java game where the player has to guess a randomly generated number within a specified range. The player receives feedback after each guess, indicating whether the guess is too high, too low, or correct. The game ends when the player guesses the number correctly or runs out of attempts.

## Key Features
- **Random Number Generation**: The program generates a random number within a predefined range.
- **Player Input**: The player is prompted to input their guess.
- **Feedback**: After each guess, the program informs the player whether their guess is too high, too low, or correct.
- **Attempt Limit**: The player has a limited number of attempts to guess the correct number. If the player uses all attempts without guessing correctly, the game reveals the correct answer.

## Program Flow
1. The game generates a random number within a given range (e.g., between 1 and 100).
2. The player is prompted to guess the number.
3. The program compares the player’s guess to the target number and provides feedback:
   - If the guess is too high, the player is prompted to try a lower number.
   - If the guess is too low, the player is prompted to try a higher number.
   - If the guess is correct, the player wins.
4. The player has a limited number of attempts (e.g., 5). If the player fails to guess the number within the given attempts, the game ends and reveals the correct number.

## Error Handling
- **Input Validation**: Ensures the player inputs a valid number for their guess.
- **Out of Attempts**: If the player exceeds the allowed number of guesses, the game informs them and ends.

## Purpose
The Number Guessing Game is designed to introduce basic concepts such as random number generation, conditional logic, loops, and user interaction in Java. It is a beginner-friendly project that demonstrates how to build a simple, interactive console game.

## Customization
- The range of numbers (e.g., 1 to 100) can be adjusted to increase or decrease difficulty.
- The maximum number of attempts can also be customized to make the game easier or more challenging.



