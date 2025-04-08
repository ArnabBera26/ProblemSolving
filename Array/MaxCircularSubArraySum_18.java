package Array;

public class MaxCircularSubArraySum_18 {
    public static void main(String[] args) {
        int[] arr = {1,-6,-7,4};
        int result = maxSumSubArray(arr);
        System.out.println("The maximum sum of circular sub-array is: "+result );
    }

    //Naive solution
    private static int maxSum(int[] arr){
        int result = arr[0];
        for(int i=0;i<arr.length;i++){
            int curr_sum = arr[i];
            int curr_max = arr[i];
            for(int j=1;j<arr.length;j++){
                int index = (i+j)%arr.length;
                curr_sum += arr[index];
                curr_max = Math.max(curr_max,curr_sum);
            }
            result = Math.max(curr_max,result);
        }
        return result;
    }

    // Efficient solution
    private static int maxSumSubArray(int[] A){
        int total = 0, maxSum = A[0], curMax = 0, minSum = A[0], curMin = 0;
        for (int a : A) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}
