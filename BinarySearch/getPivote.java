public class getPivote {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 23, 11, 1 };
        int findPivotElement = getPivot(arr, 5);
        System.out.println("Pivot Element is : " + findPivotElement);

    }

    public static int getPivot(int arr[]) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= arr[0]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return e;
    }
}
