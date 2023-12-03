package org.example;


public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(5, 10, 20);

        System.out.println("Initial seating arrangement for hall 1:");
        cinema.printSeatingArrangement(1);

        System.out.println("\nAttempting to book seats 5, 6, 7, 8 in row 4 of hall 1...");
        cinema.bookSeats(1, 4, new int[]{5, 6, 7, 8});
        cinema.printSeatingArrangement(1);

        System.out.println("\nChecking availability for 4 consecutive seats in hall 1...");
        boolean isAvailable = cinema.checkAvailability(1, 4);
        System.out.println("Availability of 4 consecutive seats: " + isAvailable);

        System.out.println("\nCancelling booking of seats 5, 6, 7, 8 in row 4 of hall 1...");
        cinema.cancelBooking(1, 4, new int[]{5, 6, 7, 8});
        cinema.printSeatingArrangement(1);

        System.out.println("\nRechecking availability for 4 consecutive seats in hall 1 after cancellation...");
        isAvailable = cinema.checkAvailability(1, 4);
        System.out.println("Availability of 4 consecutive seats after cancellation: " + isAvailable);

    }
}