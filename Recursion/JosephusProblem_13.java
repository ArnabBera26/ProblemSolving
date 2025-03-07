package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people: ");
        int n = sc.nextInt();
        System.out.println("Enter the frequency: ");
        int k = sc.nextInt();
        int result = safePos(n,k);
        System.out.println("The last remaining person will be: "+result);
    }

    static int safePos(int n, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        k=k-1;
        int index = 0;
        josephus(k,index,list);
        return list.get(0);
    }

    private static void  josephus(int k, int index, ArrayList<Integer> list) {
        if(list.size()==1){
            return;
        }

        index = (index+k)%list.size();
        list.remove(index);
        josephus(k,index,list);
    }


}
