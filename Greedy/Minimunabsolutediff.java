import java.util.*;
public class Minimumabsolutediff{

public static void main(String args[]){
int A[] = {1,2,3};
int B[] = {2,1,3};
int minabs = 0;
Arrays.sort(A);
Arrays.sort(B);

for(int i=0;i<n;i++){
    minabs + = Math.abs(A[i]-B[i]);
}
System.out.print(minabs);
    } 
}