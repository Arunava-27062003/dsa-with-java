
public class BubbleSort {
    public static void printArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,9,8,1,2,3};

        for(int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] + arr[j+1] - (arr[j+1] = arr[j]); // swap
                }
            }
        }
        printArr(arr);
    }
}
