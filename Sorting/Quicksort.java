public class Quicksort {
    public static void quicksort(int arr[],int si,int ei){

        if(si>ei){
            return;
        }
        int partition = partition( arr, si, ei);

        quicksort(arr, si, partition-1);
        quicksort(arr, partition+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
    int pivet = arr[ei];
     int i = si-1;
     for(int j=si;j<ei;j++){
        if(arr[j]<=pivet){
            i++;
           int  temp = arr[j];
            arr[j] = arr[i];
            arr[i]= temp;
        }
     }
     i++;
     int temp = pivet;
     arr[ei] = arr[i];
     arr[i]= temp;
     return i;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   public static void main(String args[]){
   int arr[] = {-2,1,9,6,4,3};
   quicksort(arr, 0, arr.length-1);
   print(arr);
   } 
}
