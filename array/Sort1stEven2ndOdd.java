package array;

public class Sort1stEven2ndOdd {
    public static void sortevenOdd(int[] arr){
        int s =  0 ; 
        int e = arr.length - 1;

        while (s < e) {
            if (arr[s] % 2 == 0) {
                s++;
            } else if (arr[e] % 2 != 0) {
                e--;
            } else {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        sortevenOdd(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
