import java.util.Stack;

public class Nextgreaterelementstack{

    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};

        Stack<Integer> s = new Stack<>();

        int nxtgreater[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            // step 1
            while (!s.isEmpty() && arr[s.peek()]<= arr[i]) {
                s.pop();
            }
// step 2
            if(s.isEmpty()){
                nxtgreater[i] = -1;
            } else {
                nxtgreater[i] = arr[s.peek()];
            }

           // step 3
           s.push(i);
        }
         for(int i=0;i<nxtgreater.length;i++){
            System.out.print(nxtgreater[i]+" ");
         }
         
         // next greater right
         // next greater left loop change
         // next smaller right change condition  arr[s.peek()] >= arr[i]
         // next smaller right change loop & condition  arr[s.peek()] >= arr[i]
        
    }
}