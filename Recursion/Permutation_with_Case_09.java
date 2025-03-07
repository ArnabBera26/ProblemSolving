package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation_with_Case_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> arr = permute(str);
        for(String st:arr)
            System.out.print(st+", ");
    }

    public static ArrayList<String> permute(String s){
        ArrayList<String> list = new ArrayList<>();
        String ip = s;
        String op = "";
        permuteWithCase(ip,op,list);
        return list;
    }

    private static void permuteWithCase(String ip, String op, ArrayList<String> list) {
        if(ip.length()==0){
            list.add(op);
            return;
        }
        int len = ip.length();
        String op1 = op+ip.charAt(0);
        String op2 = op+Character.toLowerCase(ip.charAt(0));
        ip = ip.substring(1,len);
        permuteWithCase(ip,op1,list);
        permuteWithCase(ip,op2,list);
    }
}
