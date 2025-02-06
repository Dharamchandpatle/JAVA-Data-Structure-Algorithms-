package LinearSearch;

public class LinearSearch {
   public static void main(String aa[]) {
      int[] arr = { 2, 3, 4, 5, 5, 678, 9, 9, 0, 05, 343, 3, 4 };
      int target = 4;
      int ans = linearSearch(arr, target);
      // int ans1 = linearSearch1(arr, target);
      // boolean ans2 = linearSearch2(arr, target);
      System.out.println(ans);
   }

   // search in the array return the index if item found , otherwise if item not
   // found return -1
   public static int linearSearch(int[] arr, int target) {
      if (arr.length == 0) {
         return -1;
      }
      for (int i = 0; i < arr.length; i++) {
         int element = arr[i];
         if (element == target) {
            return i;
         }

      }
      return - 1 ;
   }

   // search the target return the element
   public static int linearSearch1(int[] arr, int target) {
      if (arr.length == 0) {
         return -1;
      }

      for (int index = 0; index < arr.length; index++) {
         int element = arr[index];
         if (element == target) {
            return element;
         }
      }

      return -1;
   }

   // search the target return the True False value

   public static boolean linearSearch2(int[] arr, int target) {
      if (arr.length == 0) {
         return false;
      }

      for (int index = 0; index < arr.length; index++) {
         int element = arr[index];
         if (element == target) {
            return true;
         }
      }

      return false;
   }

}
