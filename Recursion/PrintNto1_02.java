package Recursion;

import java.util.Scanner;

public class PrintNto1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        printNatural(num);
    }

    static void printNatural(int num){
        //base case
        if(num<=1){
            System.out.print(num+", ");
            return;
        }

        //induction
        System.out.print(num+", ");
        //hypothesis
        printNatural(num-1);
    }
}
