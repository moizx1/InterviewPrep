package Arrays;

import java.util.*;

public class TwoSum {

//    public static int[] twoSum(int[] nums, int target){
//        int[] result = new int[2];
//        for(int i=0; i<nums.length; i++){
//            int index = i;
//            for (int j=0; j< nums.length; j++){
//                if(nums[index]+nums[j] == target  &&  index != j){
//                    System.out.println("hello");
//                    result[0] = index;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        return result;
//    }

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> newNums = new HashMap<Integer, Integer>();
        for(int i=0; i< nums.length; i++){
            newNums.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            if(newNums.containsKey(target-nums[i]) && i != newNums.get(target-nums[i])){
                result[0] = i;
                result[1] = newNums.get(target-nums[i]);
                return result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] result = twoSum(arr, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
