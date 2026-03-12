package datastructures.linear.linkedlist;
class LL {
    Node head;
    private int size;

    LL() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;//we don't know the address of the next node
            size++;//Increment the size as soon as the node is created
        }
    }

    public void printList() {
        Node curr = head;//pointer pointing to current value that is head
        while (curr != null) {//till pointer reaches null
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void addFirst(String data) {
        //Create a new node
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        //Create a new node
        Node newNode = new Node(data);//adding a new node means creating a new node first
        //Empty List
        if (head == null) {
            head = newNode;
            return;
        }
        // if there are multiple nodes we need to find the last  node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        //At the end of this loop,we will stand at the last node
        //Point the last node next pointer to the new node
        //we don't need to point the new node to null as it is already pointed to null in the constructor(this.next=null;)
        last.next = newNode;
    }

    public void removeFirst() {
        //Empty List->cannot remove the head node
        if (head == null) {
            System.out.println("List is empty,Can't delete the head!");
            return;
        }
        //For a single node,the head will point to the next(null)
        //For multiple nodes,the head will point to the next (head.next)
        head = this.head.next;
    }

    public void removeLast() {
        //Empty List->cannot remove the tail node
        if (head == null) {
            System.out.println("List is empty,Can't delete the tail!");
            return;
        }
        //single element in the list
        if (head.next == null) {
            head = null;//C/C++ style of code
            return;
        }
        //Multiple elements in the list
        Node curr = head;
        Node last = head.next;
        while (last.next != null) {
            curr = last;
            last = last.next;
        }
        //The last node will be cleared by the jvm if not used
        //So we point the second Last(curr)node to null pointer
        curr.next = null;
        size--;
    }

    public void removeTarget(String target) {
        if (head == null) {
            System.out.println("LIst is empty cant delete the target");
            return;
        }
        if (head.data.equals(target)) {
            head = head.next;
            size--;
            return;
        }
        //case : target is anywhere in the list.
        Node prev = null;
        Node curr = head;
        while (curr != null && !curr.data.equals(target)) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Target not found in the list");
            return;
        }
        prev.next = curr.next;
        size--;

    }

    public static void main(String[] args) {
        LL sll = new LL();
        sll.addFirst("DSA");
        sll.addFirst("Learning");
        sll.addFirst("We");
        sll.addFirst("Are");
        sll.printList();
        sll.addLast("in");
        sll.addLast("Java");
        sll.addLast("at");
        sll.addLast("SNPSU");
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.printList();
        sll.removeTarget("learning");
        sll.printList();
        sll.removeTarget("Python");
    }
}




