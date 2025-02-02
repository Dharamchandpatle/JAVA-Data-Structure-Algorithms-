package LinearSearch;

public class SearchInRange {

    public static void main (String aa[]){
        int arr[] = {2,1,2,3343,54,56,567,33};
        int target = 54;
        System.out.println(linearSearch(arr,target , 1, 6));
    }
    public static int linearSearch(int[] arr , int target ,int start ,int end ){
        if(arr.length == 0){
            return -1 ;
        }
    
        for(int index = start ; index< end ; index++){
         int element = arr[index];
         if(element == target){
            return index ;
         }
        }
    
        return -1;
     }
    }