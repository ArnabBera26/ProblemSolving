package Recursion;

import java.util.Scanner;

public class RopeCutting_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = maxPices(n,a,b,c);
        System.out.println("The max piece can be done: "+result);
    }

    public static int maxPices(int n,int a,int b,int c){
        if(n==0)
            return 0;
        if(n<0)
            return -1;

        int num = Math.max(Math.max(maxPices(n-a,a,b,c),maxPices(n-b,a,b,c)),maxPices(n-c,a,b,c));
        if(num < 0)
            return -1;
        return num+1;
    }
}
