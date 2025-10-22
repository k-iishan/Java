

import java.util.*;

public class Hashmap01 {
    public static void main(String[] args) {
        int[10] nums ;
        int i =1;
       HashMap<Integer , Integer> hash = new HashMap<>(nums.length);
       for(int a : nums){
        hash.put(i, a);
        i++;
       }
       
       hash.remove(hash.containsValue(val));
       for(int j =0 ; j < hash.length ; j++){
        nums[j] = hash.get(hash)
       }
    }
}