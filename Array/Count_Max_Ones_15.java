package Array;

import java.util.Currency;

public class Count_Max_Ones_15 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int result = onesCount(arr);
        System.out.println(result);
    }

    //Naive Solution
    private static int countMax(int[] arr){
        int res = 0;
        int i=0;
        int len = arr.length;
        int cur_res = 0;
        while (i<len){
            while (i<len && arr[i] != 0){
                cur_res++;
                i++;
            }
            res = Math.max(res,cur_res);
            cur_res=0;
            i++;
        }
        return res;
    }

    // efficient solution
    private static int onesCount(int[] arr){
        int result = 0;
        int curr = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                curr=0;
            }else {
                curr++;
                result = Math.max(curr,result);
            }
        }
        return result;
    }
}
