# Java Laboratory Work №1: Book and Library Management

This repository contains a Java program designed for managing a basic library. Within this library system, books are stored, and each book has the following attributes:

- Title
- Author
- ISBN Number
- Year of Publication

## Steps:

### Implementation of the Book Class:

- Defined attributes: title, author, ISBN, and year.
- Provided a constructor to initialize the book details.
- Overridden the toString() method to display book details.

### Implementation of the Library Class:

- Utilized an ArrayList<Book> to maintain the book records.
#### Implemented addBook(Book book) method:
- Checks for duplicates using the ISBN and the title. 
- Adds the book if no duplicate is found.
#### Implemented booksList() method:
- Returns the list of all books in the library.
#### Implemented findBookByTitle(String title) method:
- Searches for a book using the given title.
- Returns the found book or null if not found.
#### Implemented removeBookByISBN(String isbn) method:
- Removes the book with the given ISBN.
- Returns true if the book was removed, false otherwise.

### Testing the Above Classes with LibraryTest:

- testAddBook(): Checks if adding books works correctly and prevents duplicates.
- testBooksList(): Validates the correct number of books present in the library.
- testFindBookByTitle(): Ensures books can be fetched by title and non-existent books return null.
- testRemoveBookByISBN(): Validates the removal of books using their ISBN.

### Demonstration of the Library System in the Main Class:

- Added two books to the library and handled possible duplicates.
- Displayed all the books in the library.
- Demonstrated the search functionality by title.
- Showcased the removal of a book using its ISBN.
- Displayed the remaining books after the removal.