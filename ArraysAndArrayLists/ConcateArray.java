import java.util.Arrays;

public class ConcateArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        int a1 = a.length;
        int b1 = b.length;

        int c1 = a1 + b1;


        int[] c= new int[c1];

        for(int j = 0 ; j<a1 ; j++){
            c[j]=a[j];
        }

        for(int i = 0 ; i<a1 ; i++){
            c[a1+i]=b[i];
        }

        System.out.println(Arrays.toString(c));
    }
}
