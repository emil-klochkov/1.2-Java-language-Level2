# 1.2-Java-language-Level2

## 1. InputHandler.java (InputHandler Class)
Handles reading different types of input (byte, int, float, double, char, String, and boolean) from the user, with proper exception handling.

readByte(String message): Asks the user to input a byte. If the user enters a value that is not a valid byte, it displays an error message and asks again until the input is correct.

readInt(String message): Asks the user to input an integer. If the user enters an invalid integer, it shows an error message and prompts the user again.

readFloat(String message): Asks the user to input a float. It expects a comma for decimal points (not a dot) and keeps asking if the input is not formatted correctly.

readDouble(String message): Asks the user to input a double. Like readFloat, it expects a comma for the decimal point and continues to prompt if the input is incorrect.

readChar(String message): Asks the user for a single character. If more than one character is entered, it throws a CustomException with a message indicating that only one character should be input.

readString(String message): Asks the user to input a string and returns it directly.

readYesNo(String message): Asks the user for a yes/no response ("y" or "n"). If the user enters anything else, it asks again until a valid response is given.

## 2. CustomException.java (CustomException Class)
Defines a custom exception for cases where more than one character is entered when only one is expected. This exception is thrown in the readChar method.

## 3. Main.java (Main Class)
Tests the methods in the InputHandler class:

It first prompts the user for different types of data (byte, int, float, etc.).

If the input is invalid (such as entering the wrong type or format), it will ask again until valid input is provided.

If a CustomException is thrown (for example, when entering more than one character), it catches the exception and prints an error message.

The Main class demonstrates how the InputHandler methods handle errors and ensure the user provides valid input before proceeding.
