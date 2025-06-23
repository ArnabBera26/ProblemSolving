package SlidingWindow;

public class Max_sum_subArray_01 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,2,9,1};
        int k = 3;
        int result = maxSum(arr,k);
        System.out.println("The maximum sum of a fixed sized sub-array is: "+result);
    }

    private static int maxSum(int[] arr,int k){
        int result = 0;
        int sum =0;
        int start = 0;
        int end = 0;
        while (end<arr.length){
            sum += arr[end];
            if (end-start+1<k)
                end++;

            else if(end-start+1==k){
                result = Math.max(sum,result);
                sum -= arr[start];
                start++;
                end++;
            }
        }
        return result;
    }
}
