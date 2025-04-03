public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "a";
        String word2 = "p";

        String res = mergeAlternately(word1, word2);
        System.out.println(res); // apbqcr
//        char[] res = word1.toCharArray();
//        System.out.println(res[0]);
    }
    public static String mergeAlternately(String word1, String word2) {
        int A = word1.length(), B = word2.length();
        int a = 0, b = 0;
        StringBuilder result = new StringBuilder();

        while (a < A && b < B) {
            result.append(word1.charAt(a++));
            result.append(word2.charAt(b++));
        }

        while (a < A) {
            result.append(word1.charAt(a++));
        }

        while (b < B) {
            result.append(word2.charAt(b++));
        }

        return result.toString();
    }
//    public static void reverseCharArray(char[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            char temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }
}
