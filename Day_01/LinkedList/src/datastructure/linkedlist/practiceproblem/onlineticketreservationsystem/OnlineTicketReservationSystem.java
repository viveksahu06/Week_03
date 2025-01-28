//Circular Linked List: Online Ticket Reservation System
//Problem Statement: Design an online ticket reservation system using a circular linked list, where each node represents a booked ticket. Each node will store the following information: Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time. Implement the following functionalities:
//Add a new ticket reservation at the end of the circular list.
//Remove a ticket by Ticket ID.
//Display the current tickets in the list.
//        Search for a ticket by Customer Name or Movie Name.
//Calculate the total number of booked tickets.
//
//        Hint:
//Use a circular linked list to represent the ticket reservations, with the last node’s next pointer pointing to the first node.
//When removing a ticket, update the circular pointers accordingly.
//For displaying all tickets, traverse the list starting from the first node, looping back after reaching the last node.

package datastructure.linkedlist.practiceproblem.onlineticketreservationsystem;

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        CircularLinkedListOnlineTicketReservationSystem system = new CircularLinkedListOnlineTicketReservationSystem();

        // Add tickets
        system.addTicket(101, "Pratham", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "Vivek", "Interstellar", "B2", "01:00 PM");
        system.addTicket(103, "Suraj", "Inception", "C3", "04:00 PM");

        // Display tickets
        system.displayTickets();

        // Search for a ticket
        system.searchTicket("Inception");

        // Remove a ticket
        system.removeTicket(102);

        // Display tickets again
        system.displayTickets();

        // Count total tickets
        System.out.println("Total tickets booked: " + system.countTickets());
    }
}
