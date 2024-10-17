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
