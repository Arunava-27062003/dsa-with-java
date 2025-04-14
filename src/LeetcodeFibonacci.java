public class LeetcodeFibonacci {
    public static void main(String[] args) {
        int n = 3;
        int first = 0;
        int second = 1;
        int sum = 0;

        for (int i = 0; i < n-1; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        System.out.println(sum);
    }

}
