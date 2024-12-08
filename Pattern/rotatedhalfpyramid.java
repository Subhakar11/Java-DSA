public class rotatedhalfpyramid {
    public static void rotatehalf(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                
                System.out.print(" ");
                for( j=1;j<=i;j++){
                    System.out.print("*");
                }
                 System.out.println();
            }
           
        }
    }
    public static void main(String args[])
    {
        rotatehalf(5);
    }
    
}
