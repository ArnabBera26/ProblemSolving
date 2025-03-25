package Array;

public class LeftRotate_byD_place_09 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 3;
        leftRotateByDplaces(arr,d);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+", ");
    }


    //efficient solution
    private static void leftRotateByDplaces(int[] arr,int d){
        int len = arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,len-1);
        reverse(arr,0,len-1);
    }

    private static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}
