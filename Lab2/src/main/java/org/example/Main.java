package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Library library = new Library();


        Book book1 = new Book("The Hobbit", "B001", "J.R.R. Tolkien");
        DVD dvd1 = new DVD("Inception", "D001", 148);



        library.add(book1);
        library.add(dvd1);


        Patron patron1 = new Patron("Alice Johnson", "P001");
        library.registerPatron(patron1);

        System.out.println("\nTrying to borrow an already borrowed book:");
        library.lendItem(patron1, book1); // Предполагается, что book1 уже одолжена


        Book book2 = new Book("1984", "B002", "George Orwell");


        System.out.println("\nTrying to borrow a book not in the library:");
        library.lendItem(patron1, book2);

        System.out.println("Lending items...");
        library.lendItem(patron1, book1);
        library.lendItem(patron1, dvd1);

        System.out.println("\nBorrowed items:");
        for (Item item : library.listBorrowedItems()) {
            System.out.println(item.getTitle());
        }

        System.out.println("\nReturning items...");
        library.returnItem(patron1, book1);
        library.returnItem(patron1, dvd1);

        System.out.println("\nAvailable items after return:");
        for (Item item : library.listAvailableItems()) {
            System.out.println(item.getTitle());
        }
    }
}