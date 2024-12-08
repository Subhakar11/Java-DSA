public class polindrome {

    public static  boolean polin(int n){
        int poli = n;
        int res=0;
        while(poli!=0){
        int rem = poli%10;
         res = res*10 +rem;
        poli=poli/10;  
        }
        if(poli==res){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println(polin(111));
    }
    
}
