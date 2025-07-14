package BinarySearch;

public class Search_In_RotatedArray_06 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,2,3};
        int k = 4;
        int result = search(arr,k);
        if(result==-1)
            System.out.println("The number does not exist in this array");
        else
            System.out.println("The index of the element is: "+result);
    }
    public static int search(int[] nums, int k) {
        int low = 0,high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==k)
                return mid;
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=k && k<=nums[mid])
                    high=mid-1;
                else
                    low = mid+1;
            }else{
                if(nums[mid]<=k && k<=nums[high])
                    low = mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}
