package MathMagic;

import java.util.Scanner;

public class CountDigitis_in_aFactorial_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int result = countDigits(num);
        System.out.println("The number of digits is: "+result);
    }

    static int countDigits(int num){
        if(num<0)
            return 0;
        if(num<=1)
            return 1;

        double digits = 0;
        for(int i=2;i<=num;i++){
            digits += Math.log10(i);
        }
        return (int)Math.floor(digits)+1;
    }
}
