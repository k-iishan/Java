package TREE;

public class T01 {

    public static class Node{
        int data ;
        Node right ;
        Node left ;
        Node(int x){
            this.data =x;
            this.left = null ;
            this.right = null ;
        }
        public static void main(String[] args) {
            Node a = new Node(12);
            Node b = new Node(67);
            Node c = new Node(73);
            Node d = new Node(45);
            a.left = b;
            a.right =c;
            c.left = d;
            
        }
    }
    
}
