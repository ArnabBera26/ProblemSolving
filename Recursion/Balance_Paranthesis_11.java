// This problem we will do using backtracking also
package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Balance_Paranthesis_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> arr = generateParenthesis(num);
        for(String str:arr)
            System.out.print(str+", ");
    }
    public static ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> list = new ArrayList<>();
        int opening = A;
        int closing = A;
        String op ="";
        generateAll(opening,closing,op,list);
        return list;
    }

    public static void generateAll(int opening,int closing,String op,ArrayList<String> list){
        if(opening==0 && closing==0){
            list.add(op);
            return;
        }
         if(opening !=0){
             String choice = op+"(";
             generateAll(opening-1,closing,choice,list);
         }
         if(opening<closing){
             String choice2 = op+")";
             generateAll(opening,closing-1,choice2,list);
         }
    }
}
