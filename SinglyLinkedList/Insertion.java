package SinglyLinkedList;

public class Insertion {
    // ---------------- NODE ----------------
    // A Node stores data and the reference to the next Node
    static class Node {
        int data;
        Node next;
        // Constructor for Node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // ---------------- VARIABLES ----------------
    // First node of the linked list
    private Node head;

    // Last node of the linked list
    private Node tail;

    // Number of nodes in the linked list
    private int size;


    // ---------------- CONSTRUCTOR ----------------
    // Creates an empty linked list
    public Insertion() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    // ---------------- INSERT AT HEAD ----------------

    // Insert a new node at the beginning
    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        // If linked list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        // If linked list is not empty
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }


    // ---------------- INSERT AT TAIL ----------------

    // Insert a new node at the end
    public void insertAtTail(int data) {

        Node newNode = new Node(data);
        // If linked list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        // If linked list is not empty
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }


    // ---------------- INSERT AT POSITION ----------------

    // Position starts from 1
    public void insertAtPosition(int data, int position) {
        // Check if position is invalid
        if (position < 1 || position > size + 1) {
            System.out.println("Insertion not possible");
            return;
        }
        // If position is 1, insert at head
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        // If position is the last position, insert at tail
        if (position == size + 1) {
            insertAtTail(data);
            return;
        }
        // Start from head
        Node prevNode = head;
        // Move to the node just before the required position
        for (int i = 1; i < position - 1; i++) {
            prevNode = prevNode.next;
        }
        // Create new node
        Node newNode = new Node(data);
        // Connect new node to the next node
        newNode.next = prevNode.next;
        // Connect previous node to new node
        prevNode.next = newNode;
        size++;
    }


    // ---------------- PRINT LIST ----------------
    // Print all elements of the linked list
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Searching in Linked List
    public boolean search(int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        return false;
    }

    // Searching in Linked List
    public int findPosition(int target){
        Node temp = head;
        int position = 1;
        while(temp != null){
            if(temp.data == target){
                return position;
            }
            else{
                temp = temp.next;
                position++;
            }
        }
        return -1;
    }

    //Updating data using position
    public void updatePosition(int position, int newData){
        if(position < 1 || position > size + 1){
            return;
        }
        Node temp = head;
        for(int i = 1; i < position; i++){
            temp = temp.next;
        }
        temp.data = newData;
    }

    // ---------------- GET SIZE ----------------
    // Returns number of nodes
    public int getSize() {
        return size;
    }

    // ---------------- IS EMPTY ----------------
    // Returns true if linked list is empty
    public boolean isEmpty() {
        return head == null;
    }


    // ---------------- GET HEAD ----------------
    // Returns the first node
    public Node getHead() {
        return head;
    }


    // ---------------- GET TAIL ----------------
    // Returns the last node
    public Node getTail() {
        return tail;
    }

    public static void main(String[] args) {

        // Create linked list
        Insertion myList = new Insertion();

        // Insert elements
        myList.insertAtHead(10);
        myList.insertAtHead(20);
        myList.insertAtTail(30);
        myList.insertAtTail(40);

        // Insert 25 at position 3
        myList.insertAtPosition(25, 3);

        // Print linked list
        myList.printList();

        // Get size
        System.out.println("Size: " + myList.getSize());

        // Check if empty
        System.out.println("Is Empty: " + myList.isEmpty());

        // Get head
        System.out.println("Head: " + myList.getHead().data);

        // Get tail
        System.out.println("Tail: " + myList.getTail().data);

        System.out.println("searching opearation: " + myList.search(25 ));

        System.out.println("searching opearation: " + myList.findPosition(10 ));

        myList.printList();

        myList.updatePosition(3, 1);
        myList.printList();

    }
}