import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

    public static void main(String[] args) {
        int a ;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        int[] arr = new int[a];
        for(int i=0 ; i< a; i++){
          arr[i]=  input.nextInt();
        }
        
        for(int b : arr){
            System.out.println(b);
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
