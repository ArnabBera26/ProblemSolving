package LinearSearch;

public class Richest_Customer_04 {
    public static void main(String[] args) {
        int[][] accounts={{1,5},{7,3},{3,5}};
        int result = maximumWealth(accounts);
        System.out.println("Richest person wealth is: "+result);
    }
    public static int maximumWealth(int[][] accounts) {
        int wealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            wealth = Math.max(wealth,temp);
        }
        return wealth;
    }
}
