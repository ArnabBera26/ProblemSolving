package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCase_Permutation_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List<String> arr = letterCasePermutation(str);
        for(String st:arr)
            System.out.print(st+", ");
    }
    public static List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        String ip = s;
        String op = "";
        permutation(ip,op,list);
        return list;
    }

    private static void permutation(String ip,String op,List<String> arr){
        if(ip.length()==0){
            arr.add(op);
            return;
        }
        int len = ip.length();
        char ch = ip.charAt(0);
        ip = ip.substring(1,len);
        if(Character.isDigit(ch)) {
            op = op + ch;
            permutation(ip, op, arr);
        } else {
            String op1 = op+Character.toLowerCase(ch);
            String op2 = op+Character.toUpperCase(ch);
            permutation(ip,op1,arr);
            permutation(ip,op2,arr);
        }
    }
}
