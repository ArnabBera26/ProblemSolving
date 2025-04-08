package Array;

public class Max_sum_subarray_16 {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        int result = maxSum(arr);
        System.out.println("The max sum sub-array is: "+result);
    }

    //efficient solution - Kadane's Algorithm
    private static int maxSum(int[] arr){
        int result = arr[0];
        int curr_max = arr[0];
        for(int i=1;i<arr.length;i++){
            curr_max = Math.max(curr_max+arr[i],arr[i]);
            result = Math.max(result,curr_max);
        }
        return result;
    }
}
