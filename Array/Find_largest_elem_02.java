package Array;

public class Find_largest_elem_02 {
    public static void main(String[] args) {
        int[] arr = {2,7,3,8,9,4,2,4};
        int result = posOfLargestElem(arr);
        System.out.println("The position of the largest element is: "+result);
    }

    private static int posOfLargestElem(int[] arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[res])
                res = i;
        }
        return res+1; //pos = index+1
    }
}
