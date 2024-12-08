public class Subset {

    public static void findsub(String str, String ans ,int i){
        // base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // yes choise
        findsub(str, ans+str.charAt(i), i+1);
        // no choice
        findsub(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findsub(str, "", 0);
    }
}
