package Arrays;
public class CheckSortedRotatedArray {
    public static boolean check(int[] nums){

        int len = nums.length, count = 0;
        for(int i=0; i<len-1; i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if (count==0){
            return true;
        }
        else if (count>1) {
            return false;
        }
        else{
            return nums[0] >= nums[nums.length - 1];
        }
    }



    public static void main(String[] args) {
        int[] nums = {5,1,2,4};
        boolean result = check(nums);
        System.out.println(result);
    }
}
