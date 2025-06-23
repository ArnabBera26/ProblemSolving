package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class First_negative_02 {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10, 5, -4, -3, -2, -1, -7, 9, 5, 4, 3} ;
        int k = 3;
        List<Integer> li = firstNegInt(arr,k);
        System.out.println();
        for(Integer item:li){
            System.out.print(item+", ");
        }
    }
    private static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> result = new ArrayList<>();
        List<Integer> st = new ArrayList<>();
        int start = 0;
        int end = 0;
        int len = arr.length;

        while (end<len){
            if(arr[end]<0)
                st.add(arr[end]);
            if(end-start+1<k)
                end++;
            else if(end-start+1==k){
                if(st.isEmpty())
                    result.add(0);
                else {
                    result.add(st.get(0));
                    if(st.get(0)==arr[start])
                        st.remove(0);
                }
                start++;
                end++;
            }
        }
        return result;
    }
}
