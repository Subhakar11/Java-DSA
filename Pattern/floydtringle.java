public class floydtringle {

public static void floydtringlepattern(int n){
     int k=1; 
       for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                
                System.out.print(" "+k +" ");
                k++;
            }
            System.out.println();
        }
}
public static void main(String args[]){
floydtringlepattern(5);
}
}
