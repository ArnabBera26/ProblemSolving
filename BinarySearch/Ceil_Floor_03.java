package BinarySearch;

public class Ceil_Floor_03 {
    public static void main(String[] args) {
        int[] arr = {10,20,21,26,27,40,50};
        int target = 29;
        int floor = floorNumber(arr,target);
        int ceil = ceilNumber(arr,target);
        System.out.println("Floor for this number will be: "+floor);
        System.out.println("Ceil for this number will be: "+ceil);
    }
    public static int floorNumber(int[] nums,int target){
        int low =0,high = nums.length-1;
        int ans = -1;
        while (low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]<=target){
                ans = nums[mid];
                low = mid+1;
            }else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int ceilNumber(int[] nums,int target){
        int low = 0,high = nums.length-1;
        int ans = -1;
        while (low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]>=target){
                ans = nums[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

}
