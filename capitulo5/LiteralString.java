package capitulo5;

public class LiteralString {
    public static void main(String[] args) {
        String str = "I like Java.";

        int size = str.length();
        char result = str.charAt(0);

        int index = str.indexOf(str);
        int lastIndex = str.lastIndexOf(str);

        System.out.println(size + " " + result + " " + index + lastIndex);
    }
}
