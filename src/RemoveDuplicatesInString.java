public class RemoveDuplicatesInString {
    public static boolean[] map = new boolean[26];

    public static void main(String[] args) {
        removeDuplicate("accccccccca", 0, "");
    }
     public static void removeDuplicate(String str, int idx, String newStr){
        if(str.length() == idx){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (!map[currChar - 'a']){
            newStr += str.charAt(idx);
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr);
        } else {
            removeDuplicate(str, idx+1, newStr);
        }
     }
}
