package SinglyLinkedList;

public class Deletion {

    // ---------------- NODE ----------------

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // ---------------- VARIABLES ----------------

    private Node head;
    private Node tail;
    private int size;


    // ---------------- CONSTRUCTOR ----------------

    public Deletion() {
        head = null;
        tail = null;
        size = 0;
    }


    // ---------------- DELETE HEAD ----------------

    // Delete the first node
    public void deleteHead() {

        // If linked list is empty
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        // If there is only one node
        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        // Move head to the second node
        head = head.next;

        // Decrease size
        size--;
    }


    // ---------------- DELETE TAIL ----------------

    // Delete the last node
    public void deleteTail() {

        // If linked list is empty
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        // If there is only one node
        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        // Start from head
        Node temp = head;

        // Find the node just before tail
        while (temp.next != tail) {
            temp = temp.next;
        }

        // Remove the connection to the old tail
        temp.next = null;

        // Make temp the new tail
        tail = temp;

        // Decrease size
        size--;
    }


    // ---------------- DELETE AT POSITION ----------------

    // Position starts from 1
    public void deleteAtPosition(int position) {

        // Check invalid position
        if (position < 1 || position > size) {
            System.out.println("Deletion not possible");
            return;
        }

        // If deleting first node
        if (position == 1) {
            deleteHead();
            return;
        }

        // If deleting last node
        if (position == size) {
            deleteTail();
            return;
        }

        // Start from head
        Node prevNode = head;

        // Move to the node before the position
        for (int i = 1; i < position - 1; i++) {
            prevNode = prevNode.next;
        }
        // Skip the node we want to delete
        prevNode.next = prevNode.next.next;
        // Decrease size
        size--;
    }


    // ---------------- PRINT LIST ----------------
    public void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }


    // ---------------- GET SIZE ----------------

    public int getSize() {
        return size;
    }


    // ---------------- MAIN ----------------

    public static void main(String[] args) {

        Deletion list = new Deletion();

        // Manually create some nodes
        // You can add your insertion methods later
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        list.tail = fourth;
        list.size = 4;

        System.out.println("Original list:");
        list.printList();

        // Delete first node
        list.deleteHead();

        System.out.println("After deleting head:");
        list.printList();

        // Delete last node
        list.deleteTail();

        System.out.println("After deleting tail:");
        list.printList();

        // Delete node at position 2
        list.deleteAtPosition(2);

        System.out.println("After deleting position 2:");
        list.printList();

        System.out.println("Size: " + list.getSize());
    }
}