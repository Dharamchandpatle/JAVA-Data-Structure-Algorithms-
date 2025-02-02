package LinearSearch;

import java.util.Arrays;

public class SearchingInString {
    public static void main(String aa[]) {
        String name = "Dharamchand";
        char target = 'c';
        // System.out.println(stringsearch(name , target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean stringsearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    // I am using Forech loop over here
    static boolean stringsearch1(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

}
