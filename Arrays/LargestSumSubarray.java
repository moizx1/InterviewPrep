package Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestSumSubarray {
    public static int getSum(int[] arr){
        int max_sum = Integer.MIN_VALUE, current_sum = 0;
        for(int i=0; i<arr.length; i++){
            if(current_sum<0) {
                current_sum = 0;
            }
            current_sum+=arr[i];
            if(current_sum > max_sum){
                max_sum=current_sum;
            }
        }

        return max_sum;
    }

//    public static int getSum(int[] arr){
//        int max_sum = Integer.MIN_VALUE, current_sum = 0;
//
//        for(int i=0; i<arr.length; i++){
//            for (int j=i; j<arr.length; j++){
//                current_sum+=arr[j];
//                if(current_sum > max_sum){
//                    max_sum=current_sum;
//                }
//            }
//            current_sum=0;
//        }
//
//        return max_sum;
//    }


    public static void main(String[] args) {
        int[] arr = {-2, 5, -1, 7, -3};
        int max_sum = getSum(arr);
        System.out.println(max_sum);
    }
}
