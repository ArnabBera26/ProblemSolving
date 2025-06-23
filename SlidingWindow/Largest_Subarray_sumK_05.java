package SlidingWindow;

public class Largest_Subarray_sumK_05 {
    public static void main(String[] args) {
        int[] arr = {4,1,1,1,2,3,5};
        int k = 5;
        int result = largestSubarrySumK(arr,k);
        System.out.println("The length of the subarray is: "+result);
    }

    public static int largestSubarrySumK(int[] arr,int k){
        int max = 0;
        int sum = 0;
        int i=0,j=0;
        while (j<arr.length){
            sum = sum+arr[j];
            if(sum<k)
                j++;
            else if(sum==k){
                int temp = j-i+1;
                max = Math.max(max,temp);
                j++;
            }else{
                while(sum>k){
                    sum -= arr[i];
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
