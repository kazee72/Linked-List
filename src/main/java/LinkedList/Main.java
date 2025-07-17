package LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        SinglyLinkedList cloned = myList.cloneList();
        myList.print();
        System.out.println(myList.size());
        cloned.print();


    }
}