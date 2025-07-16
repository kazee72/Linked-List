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

    // Print all node values in the list
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

}


