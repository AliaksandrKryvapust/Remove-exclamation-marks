public class Source {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(removeExclamationMarks(str).equals("Hello World"));
    }
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!","");
    }
}
