package MathMagic;

import java.util.Scanner;

public class Power_of_aNumber_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter the power: ");
        int pow = sc.nextInt();
        int result = power2(num,pow);
        System.out.println("The result is: "+result);
    }

    //naive solution
    static int power(int num,int pow){
        int result = num;
        if(pow==0) return 1;
        for(int i=2;i<=pow;i++)
            result = result*num;
        return result;
    }

    //efficient solution
    static int power2(int num,int pow){

        if(pow==0) return 1;
        int temp = power(num,pow/2);
        int result = temp*temp;
        if(pow%2==0)
            return result;
        else
            return result*num;
    }
}
