package LinearSearch;

public class EvenNumber_Digits_03 {
    public static void main(String[] args) {
        int[] nums = {1234,345,2,6,12};
        int result = findNumbers(nums);
        System.out.println("The number of even number digits is: "+result);
    }

    public static int findNumbers(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(evenDigit(nums[i]))
                count++;
        }
        return count;
    }

    public static boolean evenDigit(int digit){
        int digitCount = 0;
        while (digit>0){
            digit=digit/10;
            digitCount++;
        }

        return digitCount%2==0;
    }

    public static boolean evenDigit2(int digit){
        int digitCount = (int)(Math.log10(digit)+1);


        return digitCount%2==0;
    }
}
