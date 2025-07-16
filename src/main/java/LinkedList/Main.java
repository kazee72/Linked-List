package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        myList.print();
    }
}