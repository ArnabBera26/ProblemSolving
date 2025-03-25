package Array;

public class Move_zeros_atEnd_07 {
    public static void main(String[] args) {
        int[] arr = {1,0,3,4,0,0,5,0,8};
        moveZerosToEnd(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+", ");
    }

    //naive approach
    private static void moveZeros(int[] arr){
        int len = arr.length;
        int[] nArray = new int[len];
        int flag =0;
        for(int i=0;i<len;i++){
            if(arr[i]!=0){
                nArray[flag] = arr[i];
                flag++;
            }
        }

        for(int i=0;i<len;i++){
            if(nArray[i] !=0)
                arr[i]=nArray[i];
            else
                arr[i]=0;
        }
    }

    //efficient solution
    private static void moveZerosToEnd(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                swap(i,count,arr);
                count++;
            }
        }
    }

    private static void swap(int num, int num2,int[] arr) {
        int temp = arr[num];
        arr[num] = arr[num2];
        arr[num2] = temp;
    }

}
