package W1Day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumber136 {
    static public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        Integer value = null;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()==1){
                 value = entry.getKey();
            }
        }
        return value;

    }

//    public static void main(String[] args) {
//        int arr[] = {4,1,2,1,2};
//
//        System.out.println(SingleNumber136.singleNumber(arr));
    }
