package LeetCode;

public class Special_Array_3151 {
    public static void main(String[] args) {
        int[] nums = {4,3,1,6};
        boolean result = isArraySpecial(nums);
        System.out.println(result);
    }

    public static boolean isArraySpecial(int[] nums) {
        int len = nums.length;

        if(len==1)
            return true;
        for(int i=0;i<len-1;i++){
            if((nums[i]%2)==(nums[i+1]%2))
                return false;
        }
        return true;
    }
}
