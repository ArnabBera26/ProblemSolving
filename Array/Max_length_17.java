// Problem statement : Maximum length of Even-Odd subarry
package Array;

public class Max_length_17 {
    public static void main(String[] args) {
        int[] arr = {10,12,14,7,8};
//        int result = countEvenOdd(arr);
        int result = countMaxLength(arr);
        System.out.println("The max length of even-odd sub-array is: "+result);
    }

    //Naive solution
    private static int countEvenOdd(int[] arr){
        int result = 1;
        for(int i=0;i<arr.length;i++){
            int current_length = 1;
            for(int j=i+1;j<arr.length;j++){
                if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j-1]%2==0 && arr[j]%2!=0))
                    current_length++;
                else
                    break;
            }
            result = Math.max(result,current_length);
        }
        return result;
    }

    // Efficient solution
    private static int countMaxLength(int[] arr){
        int result = 1;
        int curr_max = 1;
        for(int i=1;i<arr.length;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0) ) {
                curr_max++;
                result = Math.max(curr_max,result);
            }
            else {
                curr_max = 1;
            }
        }
        return result;
    }
}
