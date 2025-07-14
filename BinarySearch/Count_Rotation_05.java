//This approach is only applicable for sorted array
package BinarySearch;

public class Count_Rotation_05 {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        int result = countRotation(arr);
        System.out.println("This array rotation count is: "+result);
    }

    public static int countRotation(int[] arr){
        if(arr.length==0 || arr==null)
            return 0;
        int low=0,high=arr.length-1;
        if(arr[low]<arr[high])
            return 0;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(mid>low && arr[mid]<arr[mid-1])
                return mid;
            else if(mid<high && arr[mid]>arr[mid+1])
                return mid+1;
            if(arr[low]<=arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return 0;
    }
}
