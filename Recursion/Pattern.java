package Recursion;

public class Pattern {
    static void pattern (int r , int c){
        if(r== 0 ){
            return ;
        }

        if(c< r){
            System.out.print("*");
            pattern(r, c+1);
        }else{
            System.out.println();
            pattern(r-1, 0);
        }
    }

    // pattern method to print a pattern of stars
    static void patternA (int r , int c){
        if(r== 0 ){
            return ;
        }

        if(c< r){
          
            patternA(r, c+1);
              System.out.print("*");
        }else{
          
            patternA(r-1, 0);
              System.out.println();
        }
    }
    public static void main(String[] args) {
        // pattern(5, 0);
        patternA(5, 0);
    }
    
}
