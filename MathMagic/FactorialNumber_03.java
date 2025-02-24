package MathMagic;

import java.util.Scanner;

public class FactorialNumber_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int fact = factorialNumber2(num);
        System.out.println("Factorial of "+num+" is: "+fact);
    }

    //this is a iterative approach
    static int factorialNumber1(int num){
        int result = 1;
        for(int i=2;i<=num;i++){
            result = result * i;
        }
        return result;
    }

    // here the recursive approach is given below
    static int factorialNumber2(int num){
        if(num==0)
            return 1;
        return num*factorialNumber2(num-1);
    }
}
