package Linklist;

public class LL03 {

    class Node {
        int val;
        Node next;

        Node(int x ){
            this.val = x;
        }

        public static void printLL(Node head){
         Node temp =  head ;
         while (temp !=null) 
         {
         System.out.println(temp.val); 
         temp = temp.next;  
         }
        }
    }
    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(65);
        Node c = new Node(73);
        a.next = b;
        b.next = c;

        printLL(a);
    }
}