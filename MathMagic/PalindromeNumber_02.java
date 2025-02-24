package MathMagic;

import java.util.Scanner;

public class PalindromeNumber_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(palindromeNumber(num))
            System.out.println(num+" is a palindrome number.");
        else
            System.out.println(num+" is not a palindrome number.");
    }

    static boolean palindromeNumber(int num){
        if(num<10)
            return true;
        int prev = num; //for future comparison. because num will be modified;
        int reverse = 0;
        while (num>0){
            int temp = num%10;
            reverse = reverse*10 +temp;
//            System.out.println(result);
            num  = num/10;
        }
        return prev==reverse; // we have to compare with prev not num;
    }


}
