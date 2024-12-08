public class Backtrackingarray {

    public static void changearray(int arr[],int i,int val) {
        if(i==arr.length){
            printarray(arr);
            return;
        }

        arr[i] = val;
        changearray(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }
    public static void main(String args[]){
            int arr[] = new int[5];
            changearray(arr, 0, 1);
            printarray(arr);
     }

    public static void printarray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
