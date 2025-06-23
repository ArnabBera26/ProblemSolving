package Array;

public class MaxAppear_Element_22 {
    public static void main(String[] args) {
        int[] left = {1,2,5,15};
        int[] right = {5,8,7,18};
        int result = maxAppear(left,right);
        System.out.println("The max appearing element in this range is: "+result);
    }

    public static int maxAppear(int[] left,int[] right){
        int[] arr = new int[101]; // because range should be 100
        int len = left.length;
        for(int i=0;i<len;i++){
            arr[left[i]]++;
            arr[right[i]+1]--;
        }

        int res = 0;
        for(int i=1;i<100;i++){
            arr[i] = arr[i-1]+arr[i];
            if(arr[i]>arr[res])
                res = i;
        }
        return res;
    }
}
