package Array;

public class Min_Group_flip_20 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,0,1,1,1,0,0,0,1,1,1};
        minGroupFlips(arr);
    }

    private static void minGroupFlips(int[] arr){
        int len = arr.length;
        for(int i=1;i<len;i++){
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0])
                    System.out.print("From "+i+" to ");
                else
                    System.out.println(i-1);
            }
        }

        if(arr[0] != arr[len-1]){
            System.out.println(len-1);
        }
    }
}
