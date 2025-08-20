class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length==0) return new ArrayList<>();
        Set<List<Integer>> list=new HashSet<>();
        List<Integer> al=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int start=i;
            int left=i+1;
            int right=n-1;
           while(left<right){
        
                int sum=nums[start]+nums[left]+nums[right];
                if(sum==0){
                   list.add(Arrays.asList(nums[start],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return new ArrayList<>(list);
    }
}