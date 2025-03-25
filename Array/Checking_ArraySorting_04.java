package Array;

public class Checking_ArraySorting_04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6,7};
        boolean result = isSorted(arr);
        System.out.println("The array is sorted or not? "+result+". ");
    }

    private static boolean isSorted(int[] arr){
        boolean flag = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
