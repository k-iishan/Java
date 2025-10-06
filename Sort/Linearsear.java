
import java.util.*;
public class Linearsear {
   public static void main(String[] args) {
    int[] arr ={15,65,621,5,89,2,15,
    3,6,5,1};
    // linear search
    
    Scanner inn = new Scanner(System.in);
    System.out.println("enter the no to find ");
    int target = inn.nextInt();
    for(int i=0 ;i <arr.length ; i++ ){
      if(arr[i]== target){
         System.err.println("index of/n"+ arr[i] + "is " + i);

      }
      else {
         System.err.println("element not found");
      }
    }

    
   }  
}
