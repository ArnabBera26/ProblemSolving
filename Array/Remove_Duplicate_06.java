package Array;

public class Remove_Duplicate_06 {
    public static void main(String[] args) {
        // Condition:- Array must be sorted
        int[] arr = {1,1,2,2,2,4,4,4,4,4};
        int lenght = newArray(arr);
        for(int i=0;i<lenght;i++){
            System.out.print(arr[i]+", ");
        }
    }

    private static int newArray(int[] arr){
        int res = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
