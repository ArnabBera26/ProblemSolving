package Recursion;

import java.util.ArrayList;
import java.util.Scanner;


public class Lucky_Number_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int num = sc.nextInt();
        boolean result = isLucky(num);
        if(result)
            System.out.println(num+ " is a lucky number.");
        else
            System.out.println(num+ " is not a lucky number.");

    }

    public static boolean isLucky(int n)
    {
        // Your code here
        ArrayList <Integer> list = new ArrayList<>();
        int k = 1;
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int index = 0;
        josephusExtended(k,index,list);
//        System.out.println(list.get(0));
        System.out.println(list);
        return list.contains(n);
    }

    private static void josephusExtended(int k, int index, ArrayList<Integer> list) {
        if(list.size()<k){
            return;
        }


        for(int i=k;i<list.size();i=i+k){
            list.remove(i);
        }
        System.out.println(list.size());
        josephusExtended(k+1,index,list);
    }

}
