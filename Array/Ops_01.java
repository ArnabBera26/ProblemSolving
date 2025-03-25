package Array;

public class Ops_01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[5];
        arr2[0] =1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        int cur_len = 4;
        int cap = 5;
        int pos = 3;

        int item = 6;
        int searched = search(arr,item);
        System.out.println("The position will be: "+searched);

    }

    private static int search(int[] arr , int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item) {
                return i+1;
            }
        }
        return -1;
    }

    private static int insert(int[] arr,int size,int cap,int pos,int num){
        if(cap == size)
            return cap;

        for(int i=cap-2;i >=pos-1;i--){
            arr[i+1] = arr[i];
        }

        arr[pos-1] = num;
        return size+1;
    }

    private static int delete(int[] arr,int pos){
        int len = arr.length;
        if(arr[pos-1]==0 && pos>len)
            return -1;

        for(int i=pos-1;i<len-1;i++){
            arr[i] = arr[i+1];
        }


        return len-1;
    }
}
