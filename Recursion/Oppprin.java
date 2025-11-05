

public class Oppprin {
    
   public static void main(String[] args) {
    
    fun(7);
    static void fun(int a){
        int n = 1;
        if( n == a){
            return;
        }
        
        fun(n +1);
        System.out.println(n);
        
        
    }
   } 
}
