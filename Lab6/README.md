# Java Laboratory Work №6: Cinema Seat Booking System

## Overview

This Java project implements a simple cinema seat booking system. It features a 3D array to represent the arrangement of seats across multiple cinema halls, allowing for basic operations like booking and canceling seats, as well as checking seat availability.

## Features

- **Seat Arrangement**: Manage a 3D array representing seats in multiple cinema halls, each having multiple rows and seats.
- **Seat Booking**: Book seats by marking them in the array, indicating that they are no longer available.
- **Cancel Booking**: Cancel a booking, making the seats available again.
- **Check Availability**: Verify if a specific number of consecutive seats are available in any row of a hall.

## Classes and Methods

- `Cinema`: Main class representing the cinema with methods to book and cancel seats, and check availability.
    - `bookSeats(int hallNumber, int row, int[] seats)`: Book a list of seats in a given hall and row.
    - `cancelBooking(int hallNumber, int row, int[] seats)`: Cancel the booking of a list of seats.
    - `checkAvailability(int hallNumber, int numSeats)`: Check if a given number of consecutive seats are available in any row of a specified hall.
    - `isSeatAvailable(int hallNumber, int row, int seat)`: Check if a specific seat is available.

## Testing

Unit tests are provided to ensure the correctness of the cinema seat booking system, covering scenarios such as:
- Booking available seats.
- Preventing double booking of seats.
- Allowing booking of seats after cancellation.
- Checking for a group of consecutive available seats.

## Usage

Compile and run the `Main` class to interact with the seat booking system, or run the provided unit tests to validate the functionality of the system.

This project demonstrates basic Java programming concepts such as array manipulation, method implementation, and unit testing.
