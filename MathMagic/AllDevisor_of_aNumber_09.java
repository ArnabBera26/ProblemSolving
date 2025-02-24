package MathMagic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllDevisor_of_aNumber_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        List<Integer> result = allDevisor3(num);
        for(Integer item:result)
        System.out.print(item+", ");
    }

    //Naive solution
    static List<Integer> allDevisor(int num){
        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=num;i++){
            if(num%i==0)
                list.add(i);
        }
        return list;
    }

    //efficient solution(but in this solution divisor are not in order)
    static List<Integer> allDevisor2(int num){
        List<Integer> list = new ArrayList<>();

        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                list.add(i);
                if(i!=num/i)
                    list.add(num/i);
            }
        }
        return list;
    }

    //most efficient solution
    static List<Integer> allDevisor3(int num){
        List<Integer> list = new ArrayList<>();
        int i;
        for(i=1;i*i<num;i++) {
            if (num % i == 0)
                list.add(i);
        }

        for(;i>=1;i--){
            if(num%i==0)
                list.add(num/i);
        }
        return list;
    }

}
