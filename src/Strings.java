public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Arunava");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'D');
        System.out.println(sb);

        // insert chart at 0
        sb.insert(0, 'K');
        System.out.println(sb);

        // delete u
        sb.delete(3, 4);
        System.out.println(sb);

        // append
        sb.append('x');
        System.out.println(sb);

        System.out.println(sb.reverse());
    }
}
