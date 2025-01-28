//Doubly Linked List: Library Management System
//Problem Statement: Design a library management system using a doubly linked list. Each node represents a book and contains the following attributes: Book Title, Author, Genre, Book ID, and Availability Status. Implement the following functionalities:
//Add a new book at the beginning, end, or at a specific position.
//Remove a book by Book ID.
//Search for a book by Book Title or Author.
//Update a book’s Availability Status.
//Display all books in forward and reverse order.
//Count the total number of books in the library.
//        Hint:
//Use a doubly linked list with two pointers (next and prev) in each node to facilitate traversal in both directions.
//Ensure that when removing a book, both the next and prev pointers are correctly updated.
//Displaying in reverse order will require traversal from the last node using prev pointers.

package datastructure.linkedlist.practiceproblem.librarymanagementsystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        DoublyLinkedListLibraryManagementSystem library = new DoublyLinkedListLibraryManagementSystem();

        // Adding books
        library.addAtBeginning("Book1", "Pratham", "Genre1", 101, true);
        library.addAtEnd("Book2", "Suraj", "Genre2", 102, true);
        library.addAt(2, "Book3", "Vivek", "Genre3", 103, true);

        // Display all books in forward order
        library.displayForward();

        // Display all books in reverse order
        library.displayReverse();

        // Search for a book
        library.searchBook("1984");

        // Update availability
        library.updateAvailability(102, false);

        // Remove a book
        library.removeBook(101);

        // Display all books after removal
        library.displayForward();

        // Count total books
        System.out.println("Total Books: " + library.countBooks());
    }
}
