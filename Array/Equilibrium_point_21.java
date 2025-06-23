package Array;

public class Equilibrium_point_20 {
    public static void main(String[] args) {
        int[] arr = {3,4,8,-9,9,7};
        boolean result = equilibriumPoint(arr);
        System.out.println("This array has a equilibrium point. -"+result);
    }

    public static boolean equilibriumPoint(int[] arr){
        int rs = 0;
        for (int i = 0; i < arr.length; i++) {
            rs+= arr[i];
        }
        int ls = 0;
        for (int j = 0; j <arr.length ; j++) {
            rs-=arr[j];
            if(ls==rs)
                return true;
            ls+=arr[j];
        }
        return false;
    }
}
