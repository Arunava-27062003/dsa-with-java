import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        int res = romanToInt("MCMXCIV");
        System.out.println(res);
    }
    public static int romanToInt(String str){
        HashMap<Character, Integer> d = new HashMap<>();
        d.put('I', 1);
        d.put('V', 5);
        d.put('X', 10);
        d.put('L', 50);
        d.put('C', 100);
        d.put('D', 500);
        d.put('M', 1000);

        int sum = 0;
        int n = str.length();
        int i = 0;

        while(i < n){
            if (i < n-1 && d.get(str.charAt(i)) < d.get(str.charAt(i+1))){
                sum += d.get(str.charAt(i+1)) - d.get(str.charAt(i));
                i += 2;
            } else {
                sum += d.get(str.charAt(i));
                i++;
            }
        }
        return sum;
    }
}
// IV
// I : 1, V : 5
// I < V
// 5 - 1 = 4
// V > I
// 5 + 1 = 6
