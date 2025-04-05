package NumberSystem;

public class getValueInBase {
    public static void main(String[] args) {
        int b = 8 ;
        int n = 634;
       int dn = getVlueInBase(n,b);
       System.out.println(dn);
    }
    public static int getVlueInBase(int n,int b){
         int rv = 0;
         int p = 1;
         
         while(n>0){
             int dig = n%b  ;
             n = n /b ;
            rv += dig *p  ;
            p = p*10 ;
         }
         return rv ;
    }
}
