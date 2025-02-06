package LinearSearch;

public class minValue {
    public static void main(String aa[]){
        int []arr = {2,1,2,-343,54,56,567,33};
        System.out.println(min(arr));
    }

    static  int min(int []arr){
        int minvalue = arr[0];
        for (int i =0 ; i <arr.length ; i++){
            if(arr[i]<minvalue){
                minvalue = arr[i];
            }
        }
        return minvalue ; 
    }
    
}
