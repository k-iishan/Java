public class LL03 {
    class Node{
        int val;
        Node next;
        Node head;
        Node tail;

        public Node(int val){
            this.val = val ;
            this.next = null;
           

        }
        public Node(int val , Node next){
            this.val = val ;
            this.next = next;
            
        }
        
    }
    public static void main(String[] args) {
        Node a = new Node(24);
        System.out.println();
    }
}
