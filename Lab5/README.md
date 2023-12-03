# Java Laboratory Work №5: Simple Banking System

## Overview

This project implements a basic banking system in Java. It features account creation, deposits, withdrawals, and transfers, with a focus on robust error handling using custom exceptions.

## Features

- **Account Management**: Create bank accounts with unique numbers and names.
- **Transactions**: Perform deposits, withdrawals, and funds transfers.
- **Exception Handling**: Includes custom exceptions for insufficient funds, negative amounts, and account not found scenarios.

## Core Components

- `BankAccount`: Manages individual account details and financial operations.
- `Bank`: Handles a collection of `BankAccount` instances and oversees money transfers between accounts.
- `Custom Exceptions`: `InsufficientFundsException`, `NegativeAmountException`, and `AccountNotFoundException` for specialized error scenarios.

## Testing

- Unit tests with JUnit and Mockito covering various scenarios, including error handling.

## Usage

- Compile and run the `Main` class to interact with the banking system.
- Run the test cases to ensure all functionalities work as expected.

Ideal for demonstrating Java OOP, exception handling, and unit testing principles.
