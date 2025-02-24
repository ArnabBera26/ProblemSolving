//here is only the most optimized approach
package MathMagic;

import java.util.Scanner;

public class CheckPrime_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean result = isPrime(num);
        if(num==1)
            System.out.println("Neither a prime nor a composite");
        else if(isPrime(num))
            System.out.println(num +" is a prime number.");
        else
            System.out.println(num+" is a composite number.");
    }

    static boolean isPrime(int num){
        if(num==2 || num==3) return true;
        if(num%2==0 || num%3==0) return false;

        for(int i=5;i*i<=num;i=i+6)
            if(num%i==0 || num%(i+2)==0)
                return false;
        return true;
    }
}
