public class CheckSortedArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        boolean res = isSorted(arr, 0);
        System.out.println(res);
    }
    // check if an array is sorted (strictly increasing)
    public static boolean isSorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
           return isSorted(arr, idx+1);
        } else {
            return false;
        }
    }
}
