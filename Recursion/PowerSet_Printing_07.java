package Recursion;

import java.util.Scanner;

public class PowerSet_Printing_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        printPowerset(ip,"");
    }

    public static void printPowerset(String ip,String op){
        //base condition
        if(ip.length()==0) {
            System.out.print(op+", ");
            return;
        }

        //induction
        String op1 = op;
        String op2 = op;
        StringBuilder temp = new StringBuilder(op2);
        temp.append(ip.charAt(0));
        op2 = temp.toString();
        ip = ip.substring(1,ip.length());

        //hypothesis
        printPowerset(ip,op1);
        printPowerset(ip,op2);
    }
}
