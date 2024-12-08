class maxsumsubarraysusingbruteforce {

    public static int maxSubArray(int nums[]) {
        int currsum = 0;
        int max  = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j; 
               currsum = 0;
                for(int k=start;k<=end;k++){
                    currsum += nums[k];
                }
                if(max<currsum){
                    max = currsum;
                }
               
            }
            System.out.println();
        }
       return max; 
    }
    public static void main(String args[]){
  int nums[] = {2,4,6,8,10};
   System.out.println(maxSubArray(nums));
    }
}