public class InsertionSort extends BubbleSort{
    public static void main(String[] args) {
        int[] arr = {7,9,8,1,2,3};

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
//            placement
            arr[j+1] = current;
        }


        printArr(arr);
    }
}
