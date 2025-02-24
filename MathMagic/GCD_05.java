package MathMagic;

import java.util.Scanner;

public class GCD_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter another number: ");
        int num2 = sc.nextInt();
//        int result = greatestComonDevisior(num1,num2);
//        int result = euclideanAlgo(num1,num2);
        int result = mostOptimized(num1,num2);

        System.out.println("The GCD of both the number is: "+result);
    }

    static int greatestComonDevisior(int num1,int num2){
        int result = Math.min(num1,num2);
        while (result>0){
            if(num1%result==0 && num2%result==0)
                break;
            result--;
        }
        return result;
    }

    static int euclideanAlgo(int a ,int b){
        while(a !=b){
            if(a<b)
                b = b-a;
            else
                a = a-b;
        }
        return a;
    }

    static int mostOptimized(int a,int b){
        if(b==0) return a;
        return mostOptimized(b,a%b);
    }
}
