package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Leaders_in_array_10 {
    public static void main(String[] args) {
        int[] arr = {7,10,4,10,6,5,2};
        leader(arr);
        ArrayList<Integer> al = leaderElements(arr);
        for(Integer item: al){
            System.out.print(item+", ");
        }


    }

    //Naive solution
    private static void leader(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            boolean falg = false;
            for(int j=i+1;j<len;j++){
                if(arr[i]<=arr[j]){
                    falg = true;
                    break;
                }
            }
            if(falg==false){
                System.out.println(arr[i]);
            }
        }
    }

    //efficient solution
    private static ArrayList<Integer> leaderElements(int[] arr){
        ArrayList<Integer> al = new ArrayList<>();
        int len = arr.length-1;
        int temp = arr[len];
        for(int i=len-1;i>=0;i--){
            if(arr[i]>temp){
                al.add(temp);
                temp = arr[i];
            }
        }
        al.add(temp);
        Collections.reverse(al);
        return al;
    }
}
