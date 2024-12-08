public class prifixsumsubarray{
    public static int maxsubarray(int arr[]){
        int max  = Integer.MIN_VALUE;
        int currsum = 0;
        int prifixarray[] = new int[arr.length];
        prifixarray[0] = arr[0];
        for(int i=1;i<prifixarray.length;i++){
             prifixarray[i] = prifixarray[i-1] +arr[i];
        } 
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
           currsum = start==0? prifixarray[end]:prifixarray[end] - prifixarray[start-1];
            }
            if(max<currsum){
                max = currsum;
            }
        }
        return max;
    }
    public static void main(String args[]){
int arr[] = {1,-2,6,-1,3};
System.out.println(maxsubarray(arr));
    }
}