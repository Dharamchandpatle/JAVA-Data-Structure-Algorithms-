import java.util.Arrays;

public class SingleArray {
    public static void main(String[] args) {
        int []number = {1,2,3,4,5,6,677,87,8};
        
        // int sum = 0 ;
        // This method is take time complexity
        // for(int num : number){
        //     sum += num ;
        // }

        // This method is optimize time complexity{ stream java8 }
        int sum = Arrays.stream(number).sum();
        System.out.println(sum);
    }
    
}
