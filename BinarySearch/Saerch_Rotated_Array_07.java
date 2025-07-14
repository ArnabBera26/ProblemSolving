package BinarySearch;

public class Saerch_Rotated_Array_07 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,3,3,3,3,3};
        int target = 1;
        boolean result = search(arr,target);
        if(result)
            System.out.println("The element is present in the array.");
        else
            System.out.println("Element is not present in the array");
    }
    public static boolean search(int[] nums,int k){
        int low =0,high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==k) {
                return true;
            }
            else if(nums[mid]==nums[low] && nums[mid]==nums[high]){
                low++;high--;
                continue;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=k && k<=nums[mid]){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }else {
                if(nums[mid]<=k && k<=nums[high]){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
        }
        return false;
    }
}
