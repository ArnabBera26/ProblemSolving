package MathMagic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactor_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = sc.nextInt();
        List<Integer> result = primeFactors2(num);
        System.out.println("Prime factors of this number are: ");
        for(int i=0;i<result.size();i++)
            System.out.print(result.get(i)+", ");
    }

    //naive solution
    static List<Integer> primeFactors(int num){
        List<Integer> list = new ArrayList<>();
        for(int i=2;i<num;i++){
            if(isPrime(i)){
                int x = i;
                while (num%x==0){
                    list.add(i);
                    x = x*i;
                }
            }
        }
        return list;
    }

    static boolean isPrime(int num){
        if(num==2 || num==3) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5;i*i<=num;i=i+6)
            if(num%i==0 || num%(i+2)==0)
                return false;

        return true;
    }

    static List<Integer> primeFactors2(int num){
        List<Integer> list = new ArrayList<>();
        for(int i=2;i*i<=num;i++){
            while(num%i==0){
                list.add(i);
                num = num/i;
            }
        }
        if(num>1)
            list.add(num);
        return list;
    }
}
