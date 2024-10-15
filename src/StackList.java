//class StackList {
//    private class Node { // Node class defined within StackList
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    private Node top; // The top node of the stack
//    private int maxSize; // Maximum size of the stack
//    private int currentSize; // Current size of the stack
//
//    // Constructor to initialize the stack
//    public StackList(int maxSize) {
//        this.maxSize = maxSize;
//        this.top = null;
//        this.currentSize = 0;
//    }
//
//    // Push method to add an item to the stack
//    public void push(int value) {
//        if (isFull()) {
//            System.out.println("Stack is full. Cannot push " + value);
//            return;
//        }
//        Node newNode = new Node(value);
//        newNode.next = top; // Point the new node to the current top
//        top = newNode; // Update top to the new node
//        currentSize++;
//        System.out.println("Pushed: " + value);
//    }
//
//    // Pop method to remove and return the top item
//    public Integer pop() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty. Cannot pop.");
//            return null;
//        }
//        int poppedValue = top.data;
//        top = top.next; // Update top to the next node
//        currentSize--;
//        return poppedValue;
//    }
//
//    // Method to get the current size of the stack
//    public int size() {
//        return currentSize;
//    }
//
//    // Method to check if the stack is empty
//    public boolean isEmpty() {
//        return currentSize == 0;
//    }
//
//    // Method to check if the stack is full
//    public boolean isFull() {
//        return currentSize == maxSize;
//    }
//
//    // Method to display the contents of the stack
//    public void display() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty.");
//            return;
//        }
//        System.out.print("Stack contents: ");
//        Node current = top;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//
//    // Method to peek at the top item without removing it
//    public Integer peek() {
//        if (isEmpty()) {
//            System.out.println("Stack is empty. Cannot peek.");
//            return null;
//        }
//        return top.data;
//    }
//}
//
//// Main class to test the StackList
//public class Main {
//    public static void main(String[] args) {
//        StackList stack = new StackList(5); // Create a stack with a maximum size of 5
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.display(); // Display the contents of the stack
//
//        System.out.println("Peek: " + stack.peek()); // Peek at the top element
//        System.out.println("Pop: " + stack.pop()); // Pop the top element
//        stack.display(); // Display the contents of the stack
//
//        stack.push(40);
//        stack.push(50);
//        stack.push(60);
//        stack.push(70); // This should indicate the stack is full
//        stack.display(); // Display the contents of the stack
//
//        System.out.println("Current size: " + stack.size()); // Check the current size
//    }
//}
