public class Test {
    public static void main(String[] args) {
        int n = 99999999;
        int res = 0;
        while(Math.abs(n)>0){
          int d = n % 10;
          res = (res + d) * 10;
          n = n / 10;
        }
        System.out.println(res/10);

    }
}
