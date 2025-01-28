//Circular Linked List: Round Robin Scheduling Algorithm
//Problem Statement: Implement a round-robin CPU scheduling algorithm using a circular linked list. Each node will represent a process and contain Process ID, Burst Time, and Priority. Implement the following functionalities:
//Add a new process at the end of the circular list.
//Remove a process by Process ID after its execution.
//Simulate the scheduling of processes in a round-robin manner with a fixed time quantum.
//Display the list of processes in the circular queue after each round.
//Calculate and display the average waiting time and turn-around time for all processes.
//Hint:
//Use a circular linked list to represent a queue of processes.
//Each process executes for a fixed time quantum, and then control moves to the next process in the circular list.
//Maintain the current node as the process being executed, and after each round, update the list to simulate execution.
//

package datastructure.linkedlist.practiceproblem.roundrobinschedulingalgorithm;

public class RoundRobinAlgorithm {
    public static void main(String[] args) {
        CircularLinkedListRoundRobinSchedulingAlgorithm scheduler = new CircularLinkedListRoundRobinSchedulingAlgorithm();

        // Adding processes to the queue
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        // Display processes
        scheduler.displayProcesses();

        // Simulate round-robin scheduling with time quantum of 4
        System.out.println("\nSimulating Round Robin Scheduling:");
        scheduler.simulateRoundRobin(4);

        // Display remaining processes (if any)
        System.out.println("\nRemaining Processes in the Queue:");
        scheduler.displayProcesses();
    }
}
