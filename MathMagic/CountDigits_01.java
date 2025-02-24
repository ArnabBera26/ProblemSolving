package MathMagic;

import java.util.Scanner;

public class CountDigits_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int result = countDigits(num);
        System.out.println("The number "+num+" contains "+result+" digits.");
    }

    static int countDigits(int num){
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
