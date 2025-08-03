package Recursion;

public class StringBuilderExample {

    static void reverse(StringBuilder str, int i, int j) {
        if (i > j) return;

        // Swap characters
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);

        // Recursive call
        reverse(str, i + 1, j - 1);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        reverse(str, 0, str.length() - 1);
        System.out.println(str.toString());  // Output: olleh
    }
}
