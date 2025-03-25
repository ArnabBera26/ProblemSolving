package Array;

public class Maximum_Difference_11 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int result = maxDifference(arr);
        System.out.println("The maximum difference will be: "+result);
    }

    //Naive solution
    private static int maxDiff(int[] arr){
        int cur_max=arr[1]-arr[0];
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                int temp = arr[j]-arr[i];
                if(temp>cur_max){
                    cur_max= temp;
                }
            }
        }
        return cur_max;
    }

    //efficient solution
    private static int maxDifference(int[] arr){
        int res = arr[1]-arr[0];
        int minVal = arr[0];
        int len = arr.length;
        for(int i=1;i<len;i++){
            res = Math.max(res,arr[i]-minVal);
            minVal = Math.min(minVal,arr[i]);
        }
        return res;
    }
}
