//upper bound -> the smallest index such that arr[ind]>n
//lower bound -> the smallest index such that arr[ind]>=n
package BinarySearch;

public class Upper_Lower_bound_02 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,9,11,13};
        int target = 7;
        int lowerBound = lowerBoundIndex(arr,target);
        int upperBound = upperBoundIndex(arr,target);
        System.out.println("The lower bound of this array is: "+lowerBound);
        System.out.println("The upper bound of this array is: "+upperBound);
    }

    public static int lowerBoundIndex(int[] nums,int target){
        int low = 0,high = nums.length-1;
        int ans = nums.length;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>=target){
                ans = mid;
                high=mid-1;
            }else {
                low =mid+1;
            }
        }
        return ans;
    }

    public static int upperBoundIndex(int[] nums,int target){
        int low = 0,high = nums.length-1;
        int ans = nums.length;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>target){
                ans = mid;
                high=mid-1;
            }else {
                low =mid+1;
            }
        }
        return ans;
    }
}
