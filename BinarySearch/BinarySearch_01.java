package BinarySearch;

public class BinarySearch_01 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int index = search2(nums,target);
        if(index==-1)
            System.out.println("Element did not found");
        else
            System.out.println("Target element is in "+(index+1)+" position");
    }

    //iterative solution
    public static int search(int[] nums, int target) {
        int low = 0,high = nums.length-1;
        while (low<high){
            int mid = (low+high)/2;
            if(target==nums[mid])
                return mid;
            else if(target>nums[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;

    }

    //recursive solution
    public static int search2(int[] nums, int target){
        int low = 0, high = nums.length-1;
        return searchRecursive(low,high,nums,target);
    }

    public static int searchRecursive(int low,int high,int[] nums,int target){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(nums[mid]==target)
            return mid;
        else if(target>nums[mid])
            return searchRecursive(mid+1,high,nums,target);
        return searchRecursive(low,mid-1,nums,target);
    }
}
