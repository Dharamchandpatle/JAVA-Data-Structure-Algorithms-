package array;

public class counte {
    public static int countValue(int[] arr , int x) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    c++;
                }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int x = 1;
        int ans = countValue(arr , x);
        System.out.println(ans);
    }
}
