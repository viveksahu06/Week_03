//Singly Linked List: Social Media Friend Connections
//Problem Statement: Create a system to manage social media friend connections using a singly linked list. Each node represents a user with User ID, Name, Age, and List of Friend IDs. Implement the following operations:
//Add a friend connection between two users.
//Remove a friend connection.
//Find mutual friends between two users.
//Display all friends of a specific user.
//        Search for a user by Name or User ID.
//Count the number of friends for each user.
//Hint:
//Use a singly linked list where each node contains a list of friends (which can be another linked list or array of Friend IDs).
//For mutual friends, traverse both lists and compare the Friend IDs.
//The List of Friend IDs for each user can be implemented as a nested linked list or array.


package datastructure.linkedlist.practiceproblem.socialmediafriendsconnections;

public class SocialMediaFriendsConnections {
    public static void main(String[] args) {
        SinglyLinkedListSocialMediaFriendConnections smfc = new SinglyLinkedListSocialMediaFriendConnections();

        // Adding users
        smfc.addUser(1, "Pratham", 25);
        smfc.addUser(2, "Vivek", 30);
        smfc.addUser(3, "Suraj", 28);

        // Adding friend connections
        smfc.addFriendConnection(1, 2);
        smfc.addFriendConnection(1, 3);

        // Display friends of a user
        smfc.displayFriends(1);

        // Finding mutual friends
        smfc.findMutualFriends(2, 3);

        // Count friends for each user
        smfc.countFriends();

        // Search user by name
        smfc.searchUserByName("Pratham");

        // Removing a friend connection
        smfc.removeFriendConnection(1, 2);

        // Display friends after removal
        smfc.displayFriends(1);
    }
}
