package MathMagic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sieve_of_Eratosthenis_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int num = sc.nextInt();
        List<Integer> result = sieveOfEratosthenis2(num);
        for(Integer item:result)
            System.out.print(item+", ");
    }

    //Naive Approach
    static List<Integer> sieveOfEratosthenis1(int num){
        List<Integer> list = new ArrayList<>();
        for(int i=2;i<=num;i++){
            if(isPrime(i))
                list.add(i);
        }
        return list;
    }

    static boolean isPrime(int num){
        if(num==2 || num==3) return true;
        if(num%2==0 ||num%3==0) return false;
        for(int i=5;i*i<=num;i=i+6)
            if(num%i==0 || num%(i+2)==0)
                return false;
        return true;
    }

    //Efficient approach
    static List<Integer> sieveOfEratosthenis2(int num){
        List<Integer> list = new ArrayList<>();
        boolean[] arr = new boolean[num+1];
        Arrays.fill(arr,true);
        for(int i=2;i*i<=num;i++){
            if(isPrime(i))
                for (int j = i*i; j <=num ; j=j+i) {
                    arr[j] = false;
                }
        }
        for(int i=2;i<=num;i++){
            if(arr[i]==true)
                list.add(i);
        }
        return list;
    }
}
