package datastructures.linear.linkedlist;

import java.util.Scanner;

class DNode{
    int data;
    DNode next;
    DNode prev;
    DNode(int data){
        this.data = data;
    }
}
public class DoublyLinkedList {
    static DNode head = null;
    static void insert(int data){
        DNode newNode = new DNode(data);
        if (head == null){
            head = newNode;
            return;
        }
        DNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp.next;
        }
        static void display(){
        DNode temp = head;
            System.out.println("null <-->");
        while(temp != null){
            System.out.println(temp.data + " <---->");
            temp = temp.next;
        }
            System.out.println("null");
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " nodes:");
        for(int i =0;i<n;i++){
            insert(sc.nextInt());
        }
        display();

    }

}
