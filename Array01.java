import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        
        int[] arr = new int[20];
        arr[1]=45;
        arr[8]=2245;
        arr[9]=5;
        arr[2]=4;
        arr[4]=411;
        arr[5]=458;

        //System.out.println(Arrays.toString(arr));
        for(int a :arr){
            System.out.println(a);
        }

    }
    
}
