public class Bubble01 {

    public void Bubble_Sort(int[] a){
        for(int i=0 ; i < a.length -1 ; i++){
            if(a[i] > a[i+1]){
                int temp ;
                temp =a[i];
                a[i] = a[i+1];
                a[i+1] = temp ;
                
            }
            else{

            }
        }
    }
    public static void main(String[] args) {
        
        //bubble sort 
        //in we compare two adjacent elemnt 
        // then swap 
        //after first pass the largest element at the posion of end
        //in ascending order sorting

        int[] arr = {45,89,75,21,46,39,54,789,24,85,54};
    }
}
