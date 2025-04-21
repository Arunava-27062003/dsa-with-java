public class MoveElementToEnd {
    public static void main(String[] args) {
//        move all 'x' to the end of the string
        String str = "axbcxxd";
//        idx -> track current character
//        count -> no.of 'x'
//        newString -> string with all 'x' to the end of the string
        String newStr = "";
        moveAllX(str, 0, 0, newStr);
    }
    public static void moveAllX(String str, int idx, int count, String newString){
        if(str.length() == idx){
            if(count == 0){
                System.out.println(newString);
            } else {
                newString += "x".repeat(Math.max(0, count));
                System.out.println(newString);
            }
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        } else {
            newString += currChar;
            moveAllX(str, idx+1, count, newString);
        }
    }
}
