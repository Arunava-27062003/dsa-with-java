public class RecursionExampleThree {
    public static void main(String[] args) {

        String str = "arunavadsjhfiuvnjahj";
//        int idx = str.length() -1;
//        printRev(str, idx);

        fandlOcurrence(str, 0, 'a');
    }
    public static void printRev(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }

    public static int first  = -1;
    public static int last = -1;

    public static void fandlOcurrence(String str, int index, char element){
        if (index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(index) == element){
            if (first == -1){
                first = index;
            } else {
                last = index;
            }
        }
        fandlOcurrence(str, index+1, element);
    }
}
