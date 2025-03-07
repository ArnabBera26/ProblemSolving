package Recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Permutation_with_Space_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        ArrayList<String> list = permutation(str) ;
        for(String st:list)
            System.out.println(st);
    }

    private static ArrayList<String> permutation(String s) {
        ArrayList<String> arr = new ArrayList<>();
        int len = s.length();
        String op =""+ s.charAt(0);
        String ip = s.substring(1,len);
        permutationWithSpace(ip,op,arr);
//        Collections.reverse(arr);
        return arr;
    }

    private static void permutationWithSpace(String ip, String op, ArrayList<String> arr) {
        if(ip.length()==0){
            arr.add(op);
            return;
        }

        int len = ip.length();
        String op1 = op+ip.charAt(0);
        String op2 = op+" "+ip.charAt(0);
        ip = ip.substring(1,len);
        permutationWithSpace(ip,op1,arr);
        permutationWithSpace(ip,op2,arr);

    }
}
