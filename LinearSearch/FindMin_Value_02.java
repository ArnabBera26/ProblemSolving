package LinearSearch;

public class FindMin_Value_02 {
    public static void main(String[] args) {
        int[] arr ={2,5,0,-1,4,6,3};
        int result = findMin(arr);
        System.out.println("The min number in the array is: "+result);
    }

    public static int findMin(int[] arr){
        int target = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<target)
                target = arr[i];
        }
        return target;
    }
}
