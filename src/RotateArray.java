public class RotateArray extends BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        rightRotate(arr, arr.length, d);
        printArr(arr);
    }
    private static void rightRotate(int[] arr, int n, int d){
        d=d%n;
        rev(arr, n-d, n-1);
        rev(arr, 0, n-d-1);
        rev(arr, 0, n-1);
    }
    private static void rev(int[] arr, int i, int j){
        while (i<=j){
            arr[j] = arr[i] + arr[j] - (arr[i] = arr[j]);
            i++;
            j--;
        }
    }
}
