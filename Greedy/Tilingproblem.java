public class Tilingproblem{

    public static int tilingproblem(int n){

        if(n==0||n==1){
            return 1;
        }
        //verticle 
        int fnm1 = tilingproblem(n-1);
        // horizontal
        int fnm2 = tilingproblem(n-2);
        int totalway = fnm1+fnm2;
        return totalway;
    }
    public static void main(String args[]){
System.out.println(tilingproblem(3));
    }
}