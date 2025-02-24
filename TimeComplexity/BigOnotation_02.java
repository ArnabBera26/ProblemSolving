//This program is about the number is whether a prime or not
package TimeComplexity;

import java.util.Scanner;

public class BigOnotation_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for check: ");
        int num = sc.nextInt();

        if(num == 1)
            System.out.println("1 is neither a prime nor a composite.");
        else if(isPrime3(num)){
            System.out.println(num+" is a prime number.");
        }else
            System.out.println(num+" is not a prime number.");

    }

    static boolean isPrime1(int num){
        for(int i=2;i<=num-1;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    static boolean isPrime2(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

    static boolean isPrime3(int num){
        if(num==2 || num==3) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5;i*i<=num;i=i+6){
            if(num%i==0 || num%(i+2)==0)
                return false;
        }
        return true;
    }
}

/*
1 2 3 4 5 6 7 8 9 10 11 12

13 14 15 16 17 18 19 20 21

22 23 24 25 26 27 28 29 30
 */