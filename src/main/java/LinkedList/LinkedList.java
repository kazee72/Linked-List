package LinkedList;

public class LinkedList {

    // Represents a single element
    private static class Node {

        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            next = null;
        }

        public void setNext(Node next) {this.next = next;}

        public Node getNext() {return next;}
        public int getValue() {return value;}
    }

    private Node head;
    private Node tail;

    LinkedList() {
        head = null;
        tail = null;
    }

    // Add a new node to the end of the list
    public void add(int value) {
        if (head == null) {
            // List is empty -> create new node and initialize head and tail
            head = tail = new Node(value);
        } else {
            // List is not empty -> create new node
            Node newNode = new Node(value);
            tail.setNext(newNode); // Set next of current tail to the new node
            tail = newNode; // Move tail to the last node
        }
    }

    // Remove node by value
    public void remove(int value) {
        // Check if list is empty
        if (head == null) {
            return;
        } else {
            Node current = head;
            Node before = null;
            // Find first instance of value in the list
            while (current != null && current.getValue() != value) {
                before = current;
                current = current.getNext();
            }

            // If value is tail -> set node before to tail
            if (current == tail) {
                before.setNext(null);
                tail = before;
            // If value is head -> set head to the next node
            } else if (current == head) {
                head = head.getNext();
            // Other cases -> set the node before the value node to next node
            } else {
                before.setNext(current.getNext());
            }
        }
    }

    // Print all node values in the list
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

}


