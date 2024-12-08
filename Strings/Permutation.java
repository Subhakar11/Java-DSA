public class Permutation {
    public static void findpermutation(String str , String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // time (n*n!)
        for(int i=0; i<str.length();i++){
            char curr = str.charAt(i);
            // "abcde" = "ab"+"cd"  = "abde"
            String newstr = str.substring(0,i) +str.substring(i+1);
            findpermutation(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findpermutation(str, "");
    }
}
