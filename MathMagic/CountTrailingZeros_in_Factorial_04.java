package MathMagic;

import java.util.Scanner;

public class CountTrailingZeros_in_Factorial_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int count = countTrailingZeros2(num);
        System.out.println("The count of trailing zeroes will be: "+count);
    }

    //This is the naive approach
    static int countTrailingZeros1(int num){
        int count = 0;
        int fact = 1;
        for(int i=2;i<=num;i++){
            fact = fact*i;
        }

        while (fact%10==0){
            count++;
            fact = fact/10;
        }
        return count;
    }

    static int countTrailingZeros2(int num){
        int count = 0;
        for(int i=5;i<num;i=i*5){
            count = count+num/i;
        }
        return count;
    }
}
