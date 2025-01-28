//Doubly Linked List: Undo/Redo Functionality for Text Editor
//Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. Each node represents a state of the text content (e.g., after typing a word or performing a command). Implement the following:
//Add a new text state at the end of the list every time the user types or performs an action.
//Implement the undo functionality (revert to the previous state).
//Implement the redo functionality (revert back to the next state after undo).
//Display the current state of the text.
//Limit the undo/redo history to a fixed size (e.g., last 10 states).
//Hint:
//Use a doubly linked list where each node represents a state of the text.
//The next pointer will represent the forward history (redo), and the prev pointer will represent the backward history (undo).
//Keep track of the current state and adjust the next and prev pointers for undo/redo operations.

package datastructure.linkedlist.practiceproblem.undoredofunctionalityfortexteditor;

public class UndoRedoFunctionalityForTextEditor {
    public static void main(String[] args) {
        DoublyLinkedListUndoRedoFunctionalityforTextEditor editor = new DoublyLinkedListUndoRedoFunctionalityforTextEditor();

        // Simulating actions
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World!!");

        // Display current state
        editor.displayCurrentState();

        // Perform undo
        editor.undo();
        editor.undo();

        // Perform redo
        editor.redo();

        // Add a new state (clears redo history)
        editor.addState("Hello Java!");

        // Display all states
        editor.displayAllStates();

        // Perform undo
        editor.undo();

        // Display current state
        editor.displayCurrentState();
    }
}
