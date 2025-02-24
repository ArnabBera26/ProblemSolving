package Recursion;

import java.util.Scanner;

public class Print1toN_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        printNaturals(num);
    }

    static void printNaturals(int num){
        //base case
        if(num<=1){
            System.out.print(num+", ");
            return;
        }

        //hypothesis
        printNaturals(num-1);
        //induction
        System.out.print(num+", ");

    }
}
