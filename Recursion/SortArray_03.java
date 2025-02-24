//this is not a good program.but we can solve it using recursion
//for sorting an array we specially use the specific sorting Algos
package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortArray_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            list.add(sc.nextInt());
        }

        sort(list);
        for(int i=0;i<num;i++){
            System.out.print(list.get(i)+", ");
        }
    }

    static void sort(List<Integer> arr){
        //base case
        if(arr.size()==1)
            return;
        int size = arr.size()-1;
        int temp = arr.remove(size);
        //hypothesis
        sort(arr);
        //induction
        insert(arr,temp);
    }

    static void insert(List<Integer> arr , int temp){
        //base case
        if(arr.size()==0 || arr.get(arr.size()-1)<=temp){
            arr.add(temp);
            return;
        }
        int size = arr.size()-1;
        int last = arr.remove(size);
        //hypothesis
        insert(arr,temp);
        //induction
        arr.add(last);
    }

}
