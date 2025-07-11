package BinarySearch;

public class First_Last_position_04 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        int target = 9;
        int[] result = searchRange(arr,target);
        for(Integer item:result)
            System.out.print(item+", ");
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        result[0] = findFristOccurance(nums,target);
        result[1] = findLastOccurance(nums,target);
        return result;
    }

    public static int findFristOccurance(int[] nums,int target){
        int low =0,high = nums.length-1;
        int index = -1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                index = mid;
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return index;
    }

    public static int findLastOccurance(int[] nums,int target){
        int low =0,high = nums.length-1;
        int index = -1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                index = mid;
                low = mid+1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return index;
    }

}
