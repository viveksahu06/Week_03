//
//Singly Linked List: Inventory Management System
//Problem Statement: Design an inventory management system using a singly linked list where each node stores information about an item such as Item Name, Item ID, Quantity, and Price. Implement the following functionalities:
//Add an item at the beginning, end, or at a specific position.
//Remove an item based on Item ID.
//Update the quantity of an item by Item ID.
//        Search for an item based on Item ID or Item Name.
//Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
//Sort the inventory based on Item Name or Price in ascending or descending order.
//Hint:
//Use a singly linked list where each node represents an item in the inventory.
//Implement sorting using an appropriate algorithm (e.g., merge sort) on the linked list.
//For total value calculation, traverse through the list and sum up Quantity * Price for each item.
package datastructure.linkedlist.practiceproblem.inventorymanagementsystem;
public class InventoryManagementSystem {
    public static void main(String[] args) {
        SinglyLinkedList ims = new SinglyLinkedList();
        // Adding items to the inventory
        ims.addAtBeginning("Iphone 16 Pro Max", 10, 2, 120000);
        ims.addAtBeginning("Samsung S25 Ultra", 11, 1, 140000);
        ims.addAtEnd("Motorola Q28", 12, 1, 70000);
        ims.addAt(2, "Samsung Galaxy", 24, 1, 90000);

        // Displaying all records
        System.out.println("------ All Items in Inventory --------");
        ims.displayAll();

        // Removing an item
        ims.removeItem(11);

        // Updating quantity of an item
        ims.updateQuantity(10, 3);

        // Calculating total inventory value
        System.out.println("Total Inventory Value: " + ims.totalInventoryValue());

        // Displaying updated records
        System.out.println("------ Updated Inventory --------");
        ims.displayAll();
    }
}
