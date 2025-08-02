package Recursion;

// import java.lang.String ;

public class removechar  {

    static String  removechar(String  s, int idx) {
        // base casse
        if (s.length() == idx) {
            return "";
        }
        char  currchar = s.charAt(idx);
        
        // recursive work
        String  smallans = removechar(s, idx + 1);
        
        // String  smallans = remove(s.substring(1));
        // String  currchar = s.charAt(0);

        if (currchar != 'a') {
            return currchar + "" + smallans;

        } else {
            return smallans;
        }

    }

    public static void main(String [] args) {
        String  s = "helloaaasssaasasaa";
        String  ans = removechar(s, 0);
        System.out.println(ans);
    }

}
