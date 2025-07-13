class Solution {
    public List<List<Integer>> permute(int[] nums) {

     List<List<Integer>> l=new ArrayList<>();
    
     helper(nums,l,0,nums.length);
     return l;
    }
    public void helper(int[] nums, List<List<Integer>> l,int index,int size){
        if(index==size-1){
            List<Integer> al=new ArrayList<>();
            for(int i=0;i<size;i++){
            al.add(nums[i]);
            }
            l.add(new ArrayList<>(al));
          
        }
        for(int i=index;i<size;i++){
            swap(i,index,nums);
            helper(nums,l,index+1,size);
            swap(i,index,nums);
        }
    }
    public void swap(int x,int y,int[] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}