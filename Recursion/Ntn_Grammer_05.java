package Recursion;

import java.util.Scanner;

public class Ntn_Grammer_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row value: ");
        int n = sc.nextInt();
        System.out.println("Enter the column value: ");
        int k =sc.nextInt();
        int result = kthGrammar(n,k);
        System.out.println(result);
    }
    public static int kthGrammar(int n, int k) {
        if(n==1 && k==1)
            return 0;
        int mid = (int) (Math.pow(2,n-1)/2);
        if(k<=mid)
            return kthGrammar(n-1,k);
        else
            return 1-kthGrammar(n-1,k-mid);
    }
}
