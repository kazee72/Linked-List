package LinkedList;

import java.util.List;

public class DoublyLinkedList {

    // Represents one element in list
    private static class Node {
        private final int value;
        private Node next;
        private Node prev;

        Node(int value) {
            this.value = value;
            next = null;
            prev = null;
        }

        public void setNext(Node next) {this.next = next;}
        public void setPrev(Node prev) {this.prev = prev;}

        public Node getNext() {return next;}
        public Node getPrev() {return prev;}
        public int getValue() {return value;}

    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getFirst() {
        return (head != null) ? head.getValue() : -1;
    }

    public int getLast() {
        return (tail != null) ? tail.getValue() : -1;
    }

    // Get value by index
    public int get(int indx) {

        // Check if index is head
        if (indx == 0) {
            return head.getValue();
        // Check index bounds
        } else if (indx < 0 || indx >= size) {
            return -1;
        }

        Node current;
        // Check if index is bigger than half the size of the list
        if (indx > (size / 2)) {
            // Iterate from tail
            current = tail;
            for (int i = size - 1; i > indx; i--) {
                current = current.getPrev();
            }
        } else {
            // Iterate from head
            current = head;
            for (int i = 0; i < indx; i++) {
                current = current.getNext();
            }
        }
        return current.getValue();


    }

    // Add node to end of list
    public void add(int value) {
        Node newNode = new Node(value);

        // Check if list is empty
        if (head == null) {
            head = tail = newNode; // Set head and tail to new node when list is empty
        } else {
            newNode.setPrev(tail); // Set prior tail to previous of new node
            tail.setNext(newNode); // Set prior tails next to new node
            tail = newNode; // Set tail to new node
        }

        size ++;
    }

    // Add node to beginning of list
    public void addFirst(int value) {
        Node newNode = new Node(value);

        // Check if list is empty
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.setNext(head); // Set prior head to new node
            head.setPrev(newNode); // Set prior heads prev to new node
            head = newNode; // Set head to new node
        }

        size ++;
    }

    // Insert node at indx
    public void insertAt(int indx, int value) {
        Node newNode = new Node(value);

        // Check if indx is head or tail
        if (indx == 0) {
            addFirst(value);
            return;
        } else if (indx == size) {
            add(value);
            return;
        // Checking index bounds
        } else if (indx < 0 || indx > size) {
            return;
        }

        Node current;
        if (indx > (size / 2)) {
            current = tail;
            for (int i = size - 1; i > indx; i--) {
                current = current.getPrev();
            }

        } else {
            current = head;
            for (int i =  0; i < indx; i++) {
                current = current.getNext();
            }
        }

        newNode.setPrev(current.getPrev()); // Set newNode's prev to prev node of current
        newNode.setNext(current); // Set newNode's next as current node
        current.getPrev().setNext(newNode); // Set next node of previous node of current node to newNode
        current.setPrev(newNode); // Set current's prev node to newNode

        size ++;
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

    // Clone the list
    public DoublyLinkedList cloneList() {
        DoublyLinkedList clonedList = new DoublyLinkedList();
        Node current = head;

        while (current != null) {
            clonedList.add(current.getValue());
            current = current.getNext();
        }

        return clonedList;
    }

    // Check if value is inside list
    public boolean contains(int value) {
        Node current = head;

        for (int i = 0; i < size; i++) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    // Get index of a value
    public int indexOf(int value) {
        Node current = head;

        for (int i = 0; i < size; i++) {
            if (current.getValue() == value) {
                return i;
            }
            current = current.getNext();
        }

        return -1;
    }

    // Remove node by value
    public void remove(int value) {
        Node current = head;

        for (int i = 0; i < size; i++) {
            // Cache next node (in case of removing current)
            Node next = current.getNext();
            // Check if current nodes value matches value to remove
            if (current.getValue() == value) {
                // Check if current is the head
                if (current == head) {
                    head = current.getNext(); // Set head to the currents next
                    // If head is not null (i.e. list is not empty), set heads prev to null
                    if (head != null) head.setPrev(null);
                    size --;
                // Check if current is the tail
                } else if (current == tail) {
                    tail = current.getPrev(); // Set tail to the currents prev
                    // If tail is not null (i.e. list is not empty), set tails next to null
                    if (tail != null) tail.setNext(null);
                    size --;
                } else {
                    current.getPrev().setNext(current.getNext());
                    current.getNext().setPrev(current.getPrev());
                    size --;
                }
            }
            current = next;
        }
    }


    public void removeAt(int indx) {

        // Check for index bounds
        if (indx < 0 || indx >= size) {
            return;
        }

        // Check for head index
        if (indx == 0) {
            head = head.getNext();
            // If head is not null (i.e. list is not empty), set heads prev to null
            if (head != null) head.setPrev(null);

        // Check for tail index
        } else if (indx == size -1) {
            tail = tail.getPrev();
            // If tail is not null (i.e. list is not empty), set tails next to null
            if (tail != null) tail.setNext(null);

        } else {
            Node current;
            // Check if index is larger than half the size
            if (indx > (size / 2)) {
                current = tail;
                // Iterate back from tail
                for (int i = size -1; i > indx; i--) {
                    current = current.getPrev();
                }

            } else {
                current = head;
                // Iterate forward from head
                for (int i = 0; i < indx; i++) {
                    current = current.getNext();
                }
            }
            current.getNext().setPrev(current.getPrev()); // Set prev node of currents next node to currents prev
            current.getPrev().setNext(current.getNext()); // Set next node of currents prev node to currents next

        }

        size --;
    }

    // Clear the list
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // Get size of list
    public int size() {
        return size;
    }

    // Print all node values in the list
    public void print() {
        DoublyLinkedList.Node current = head;
        while (current != null) {
            System.out.print(current.getValue() + ", ");
            current = current.getNext();
        }
        System.out.println("\n");
    }
}
