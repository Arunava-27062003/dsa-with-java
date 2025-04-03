import java.util.ArrayList;

public class ClosestNumberToZero {
    public static void main(String[] args) {
        int[] arr = {2,1,1,-1,100000};

        int num = findClosestNumber(arr);
        System.out.println(num);
    }

    public static int findClosestNumber(int[] nums){
        int closest = nums[0];

        for(int i : nums){
            if(Math.abs(i) <= Math.abs(closest)){
                closest = i;
            }
        }

        if(closest <= 0 && contains(nums, Math.abs(closest))){
            return Math.abs(closest);
        } else {
            return closest;
        }

    }

    public static boolean contains(int[] nums, int n){
        for(int i : nums){
            if(i == n) return true;
        }
        return false;
    }
}
