class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        
        int sum=0;
     
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            
        }
        max=Math.max(sum,max);
       for(int i=k;i<nums.length;i++){

          
            sum+=nums[i]-nums[i-k];
            max=Math.max(sum,max);
            
       }
       return (double)max/k;
        
    }
}