public class Optimisepowerrecursion {

    public static int optimisepow(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpow = optimisepow(a, n/2);
        int halfpowsq = halfpow*halfpow;
        if(n%2!=0){
            halfpowsq= a*halfpowsq;
        }
        return halfpowsq;
    }

    public static void main (String args[]){
            int a=2;
            int n=10;
         System.out.println(optimisepow(a, n));

    }

}
