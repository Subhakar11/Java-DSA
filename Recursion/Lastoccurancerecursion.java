public class Lastoccurancerecursion {

    public static int lastoccurance(int arr[],int key ,int i){
        if(i== arr.length){
            return -1;
        }
        int isfound  = lastoccurance(arr, key, i+1);
        if(isfound!=-1){
            return isfound;
        }
        if(arr[i]==key)
            return i;
        
            return isfound;
    }
    public static void main(String args[]){
        int arr[] = {1,3,4,5,5,5,5,5,5};
        System.out.println(lastoccurance(arr,5, 0));
    }
}
