package array ;

public class EuclidsAlgo {
    
    public static int EuclidsAlgo( int a, int b ){
         if(a == 0) return b ;
         if(b == 0) return a ;

         while(a != b){
            if( a> b){
                a = a-b ;
            }
            else{
                b= b-a ;
            }
         }
         return a ;

    }
    public static void main(String[] args) {
        int a = 72 ;
        int b = 24 ;
        int ans = EuclidsAlgo(a, b);
        System.out.println(ans );
    }
}
