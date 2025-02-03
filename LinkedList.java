/* Linked list in java -It is a linear data structure that can be visualized as a chain with different nodes connected,
 where each node represents a different element. The difference between arrays and linked lists is that, unlike arrays, 
 the elements are not stored at a contiguous location. Since for any element to be added in an array, we need the exact next memory
 location to be empty, and it is impossible to guarantee that it is possible. Hence adding elements to an array is not possible after 
  the initial assignment of size.
 
A linked list is a data structure containing two crucial pieces of information, 
    the first being the data and the other being the pointer to the next element. 
    The ‘head’ is the first node, and the ‘tail’ is the last node in a linked list.


Applications of Linked Lists:

    .Creating Data Structures: Linked lists serve as the foundation for building other dynamic data structures, such as stacks and queues.
    .Dynamic Memory Allocation: Dynamic memory allocation relies on linked lists to manage and allocate memory blocks efficiently.
    .Web Browser is one important application of Linked List.

Types of Linked Lists:
    1.Singly Linked Lists: In a singly linked list, each node points to the next node in the sequence. Traversal is straightforward 
        but limited to moving in one direction, from the head to the tail.

    2.Doubly Linked Lists: In this each node points to both the next node and the previous node, thus allowing it for bidirectional connectivity. 

    3. Circular Linked Lists: In a circular linked list, the last node points back to the head node, forming a closed loop.

*/

class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;  
        this.next = null; 
    }
};

public class LinkedList{

    private static Node convertArrtoLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static int lengthofLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
       
    }
    private static  Node deleteLastNode(Node head){
        Node temp = head;
        if(head == null || head.next == null){
            return head;
        }

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static void main(String[] args){
        int[] arr = {12,2,3,4,6,8};
        Node head = convertArrtoLL(arr);
        // System.out.println("linked list head ==>" + head.data);
        Node temp = head;
        while(temp != null){
            System.out.println("linkedlist= "+temp.data);
            temp = temp.next;
        }
        // System.out.println("size of LL:"+lengthofLL(head)); 
        head = deleteLastNode(head);
        temp = head;
        while(temp != null){
            System.out.println("linkedlist after deletion= "+temp.data);
            temp = temp.next;
        }
    }
}