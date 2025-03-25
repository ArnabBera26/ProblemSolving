package Array;

public class Stock_Buy_Sell_13 {
    public static void main(String[] args) {
        int[] arr = {13,10,9,8};
        int len = arr.length-1;

//        int result = maxProfit(arr,0,len);
        int result = maximumProfit(arr);
        System.out.println("Maximum frofit will be: "+result);
    }

    // Naive approach
    private static int maxProfit(int[] arr, int start, int end){
        if(end<=start) return 0;
        int profit = 0;
        for(int i=start;i<end;i++){
            for(int j = i+1;j<=end;j++){
                int curr_profit = arr[j]-arr[i]+
                        maxProfit(arr,start,i-1)+maxProfit(arr,j+1,end);
                profit = Math.max(curr_profit,profit);
            }
        }
        return profit;
    }

    // efficient solution
    private static int maximumProfit(int[] arr){
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1])
                profit = profit+arr[i]-arr[i-1];
        }
        return profit;
    }
}
