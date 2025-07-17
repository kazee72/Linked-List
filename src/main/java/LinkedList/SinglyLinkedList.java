package LinkedList;

import java.util.List;

public class SinglyLinkedList {

    // Represents a single element
    private static class Node {

        private final int value;
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

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public int getFirst() {
        return head.getValue();
    }

    public int getLast() {
        return tail.getValue();
    }

    // Get value by index
    public int get(int indx) {
        int counter = 0;
        Node current = head;

        while (current != null) {
            if (counter == indx) {
                return current.getValue();
            }
            current = current.getNext();
            counter ++;
        }

        return -1;
    }

    // Add new node to beginning of the list
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head); // Set old head to next of new node
        head = newNode; // Set head to new node

        // If list is empty also set tail to new node
        if (tail == null) {
            tail = newNode;
        }
    }

    // Add new node to end of the list
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

    // Insert new node at index
    public void insertAt(int indx, int value) {
        Node current = head;
        Node before = null;

        // Check for first and last index
        if (indx == 0) {
            addFirst(value);
            return;
        } else if (indx == size()) {
            add(value);
            return;
        // Check if index is out of bounds
        } else if (indx < 0 || indx > size()) {
            return;
        }

        for (int i = 0; i < indx; i++) {
            before = current;
            current = current.getNext();
        }

        Node newNode = new Node(value);
        before.setNext(newNode);
        newNode.setNext(current);

    }

    // Add a collection of values
    public void addAll(List<Integer> values) {
        for (int value : values) {
            add(value);
        }
    }

    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Get size of list
    public int size() {
        int counter = 0;
        Node current = head;

        while (current != null) {
            current = current.getNext();
            counter ++;
        }

        return counter;
    }

    // Create a deep copy of the list
    public SinglyLinkedList cloneList() {
        SinglyLinkedList clonedList = new SinglyLinkedList();
        Node current = head;

        while (current != null) {
            clonedList.add(current.getValue());
            current = current.getNext();
        }

        return clonedList;
    }

    // Check if list contains value
    public boolean contains(int value) {
        Node current = head;

        while (current != null) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    // Return index of the value inside the list
    public int indexOf(int value) {
        int indx = 0;
        Node current = head;

        while (current != null) {
            if (current.getValue() == value) {
                return indx;
            }
            indx ++;
            current = current.getNext();
        }
        return -1; // Value not found -> -1
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

            // Value not found
            if (current == null) {
                return;
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


    public int removeAt(int indx) {
        Node current = head;
        Node before = null;
        int nodeToRemove;

        // Check for 0 index
        if (indx == 0) {
            nodeToRemove = head.getValue();
            head = head.getNext();
            return nodeToRemove;
        // Check if index is out of bounds
        } else if (indx < 0 || indx >= size()) {
            return -1;
        }

        for (int i = 0; i < indx; i++) {
            before = current;
            current = current.getNext();
        }

        if (current == tail) {
            tail = before;
        }

        before.setNext(current.getNext());

        return current.getValue();

    }

    // Print all node values in the list
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + ", ");
            current = current.getNext();
        }
        System.out.println("\n");
    }

}


