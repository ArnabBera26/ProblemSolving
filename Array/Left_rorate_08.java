package Array;

public class Left_rorate_08 {
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5};
     leftRotateByOne(arr);
     for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+", ");
    }

    private static void leftRotateByOne(int[] arr){
        int temp = arr[0];
        int len = arr.length;
        for(int i=1;i<len;i++){
            arr[i-1] = arr[i];
        }
        arr[len-1] = temp;
    }
}
