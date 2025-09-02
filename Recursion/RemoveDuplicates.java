package Recursion;

public class RemoveDuplicates {
    public static void removeDuplicate(String str , int idx , StringBuilder newstr , boolean [] map){
        // base case
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        // recusive work 
        char currChar = str.charAt(idx) ;
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, idx + 1, newstr, map);
        }else{
             map[currChar - 'a'] = true;
            removeDuplicate(str, idx +1 , newstr.append(currChar), map);
        }

        
    }
    public static void main(String[] args) {
        String str = "dhhaarrammcchhanndd";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
