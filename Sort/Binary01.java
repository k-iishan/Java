public class Binary01 {
// binary search worl on  sorted array either in ascending or 
// descending order 
// it 
    public static int Sear(int[] x ,int target ){
      int top , end , mid ;
      top = 0;
      end = x.length -1;
      while(end>=top){
        mid = top +(end-top)/2 ;
        if(x[mid]==target){
            return mid;
        }
        else if (x[mid]<target) {
            top = mid+1;
        }
        else if (x[mid]> target) {
            end = mid-1;
            
        }
      }

        return -1;
    }

    public static void main(String[] args) {
       

        int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,15};
         
        int ans = Sear(arr, 5);
        System.out.println(ans);
    }
}
