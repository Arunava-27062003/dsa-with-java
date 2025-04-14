public class RcursionExample {
    public static void main(String[] args) {
//        int n = 5;
//        printNumDesc(n);
//
//        int m = 1;
//        printNumAscn(m);

//        sumOfNumbers(1, 5, 0); // sum of first n natural numbers

//        int factorial = getFactorial(5);
//        System.out.println(factorial); // 5! = 120

//        System.out.println("Fibonacci Series");
//        int n = 7;
//        System.out.println(0);
//        System.out.println(1);
//        fibonacciSeries(0,1, n-2);

        int stack_height_res = calcPower(5, 5);
        System.out.println(stack_height_res);
        System.out.println((int) (Math.pow(5, 5)));
    }
    public static void printNumDesc(int n){ // print numbers from n to 1
        if(n == 0) return;

        System.out.println(n);
        printNumDesc(n-1);
    }

    public static void printNumAscn(int n){ // print numbers from 1 to 5

        if(n == 6) return;

        System.out.println(n);
        printNumAscn(n+1);
    }

    public static void sumOfNumbers(int i, int n, int sum){ // sum of first n natural numbers

        if (i == n){
            sum+=i;
            System.out.println(sum);
            return;
        }

        sum += i;
        sumOfNumbers(i+1, n, sum);
    }
    public static int getFactorial(int n){

        if ( n==1 || n==0){
            return 1;
        }
        int factnm1 = getFactorial(n-1);
        return n * factnm1;
    }

    public static void fibonacciSeries(int a, int b, int n){
        if(n == 0){
            return;
        }

        int c = a + b;
        System.out.println(c);
        fibonacciSeries(b, c, n-1);
    }

    public static int calcPower(int x, int n){
        if(n == 0){ // base case 1
            return 1;
        }
        if (x == 0){ // base case 2
            return 0;
        }
//        stack height n
//        int xPownm1 = calcPower(x, n-1); // x^n-1
//        return x * xPownm1;

//        stack height Log n
        if (n%2 == 0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        } else {
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
}
