public class Gridways {

    public static int totalgridways(int i, int j, int n, int m ){
        if(i==n-1 &&j==m-1){ //condition for last cell
            return 1;
        }
        else if (i==n||j==n) {//boundry cross condition
            return 0;
        }
        int w1 = totalgridways(i+1, j, n, m);
        int w2 = totalgridways(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(totalgridways( 0, 0, n, m));   
    }
}
