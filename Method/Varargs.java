package Method;

import java.util.Arrays;

public class Varargs {
    public static void main(String aaa[])
    {
        fun(1,2,3,4,54654654,465,654,6547,645,465,465,546,546,345,43,234,234);
        mul(111,333, "Dharam ","Dharam ","Dharam ","Dharam ","Dharam ","Dharam ","Dharam ","Dharam ","Dharam ","Dharam ");
    }

    static void mul(int aa, int b , String...v)
    {
        System.out.println(aa);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
    
}
