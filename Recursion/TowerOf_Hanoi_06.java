package Recursion;

public class TowerOf_Hanoi_06 {
    public static void main(String[] args) {

        towerOfHanoi(3,1,2,3);
    }
    public static void towerOfHanoi(int n, int source, int helper, int destination) {
        // Your code here
        if(n==1){
            System.out.println("move 1 form "+source+" to "+destination);
            return;
        }
        towerOfHanoi(n-1,source,destination,helper);
        System.out.println("move "+n +" from " +source+" to "+destination);
        towerOfHanoi(n-1,helper,source,destination);
    }
}
