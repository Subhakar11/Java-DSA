public class Kadanessumsubarray{

    public static void kadanessum(int arr[]){
        
        int ms = Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs= 0;
            }
            ms =Math.max(cs, ms);
        }
        System.out.println(ms);
    }
    public static void main(String args[]){
    int arr[] = {-2,-3,4,-1,-2,1,5,-3};
    kadanessum(arr);
    }
}


// if all element in array are negative then upper code can not give right answer follow this code
        class Solution {
    public static boolean checknums(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int arr = nums[i];
            if (arr >= 0) {
                return true;
            }
            
        }
        return false;
    }

    public int maxSubArray(int[] nums) {
        if (checknums(nums)) {
            int cs = 0;
            int ms = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                cs = cs + nums[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
            return ms;
        } else {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
            return max;
        }
    }
}




public static int maximumSubarraySum(int[] arr) {
    int maxSoFar = arr[0];
    int maxEndingHere = arr[0];

    for (int i = 1; i < arr.length; i++) {
        maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
        maxSoFar = Math.max(maxSoFar, maxEndingHere);
    }

    return maxSoFar;
}
 
