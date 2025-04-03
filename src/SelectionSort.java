public class SelectionSort extends BubbleSort{
    public static void main(String[] args) {
        int[] arr = {7,9,8,1,2,3};

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            arr[smallest] = arr[smallest] + arr[i] - (arr[i] = arr[smallest]); // swap
        }
        printArr(arr);
    }
}
