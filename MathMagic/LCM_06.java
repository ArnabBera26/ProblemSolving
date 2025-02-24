// here we use the concept of math:
//  GCD* LCM = num1*num2
package MathMagic;

import java.util.Scanner;

public class LCM_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();
//        int result = lCM(num1,num2);
        int result = lCM2(num1,num2);
        System.out.println("LCM of two number is: "+result);
    }

    //Naive approach
    static int lCM(int num1,int num2){
        int result = Math.max(num1,num2);
        while (true){
            if(result%num1==0 && result%num2==0)
                break;
            result++;
        }
        return result;
    }

    //efficient approach
    static int lCM2(int num1,int num2){
        int result = (num1*num2)/gCD(num1,num2);
        return result;
    }

    static int gCD(int num1, int num2) {
        if(num2==0)
            return num1;
        return gCD(num2,num1%num2);
    }
}
