public class Tilingproblemrecursion {
    public static int tiling(int n){
        if(n==1||n==0){
            return 1;
        }
        int fnm1 = tiling(n-1);
        int fnm2 =fnm1;
        int totalway =fnm1+fnm2;
        return totalway;
    }
   public static void main(String args[]){
       
        System.out.println(tiling(5));
    }
}
