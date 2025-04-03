public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,4,5,6,9,12};
        int n = 0;
        int res = searchElement(arr, n);
        System.out.println(res);
    }
    public static int searchElement(int[] arr, int n){
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end) / 2;

        if (arr[mid] == n) {
            return mid;
        } else if(arr[start] == n){
            return start;
        } else if (arr[end] == n) {
            return end;
        } else {
            return findElement(start, end, mid, arr, n);
        }
    }
    public static int findElement(int start, int end, int mid, int[] arr, int n){
        if (n > arr[mid]){
            return findElement(0, mid, (start+end)/2, arr, n);
        } else if (n < arr[mid]) {
            return findElement(mid, arr.length - 1, (start+end)/2, arr, n);
        } else return -1;
    }
}
