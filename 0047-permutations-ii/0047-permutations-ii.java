class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,l,0);
        return l;
    }
    public void helper(int[] nums,List<List<Integer>> l,int index){
        if(index==nums.length-1){
             List<Integer> al=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                al.add(nums[i]);
            }
            if(l.contains(al)){
                return;
            }
            else{
           
            l.add(new ArrayList<>(al));
            }
        }
        for(int i=index;i<nums.length;i++){
           
            swap(i,index,nums);
           
            helper(nums,l,index+1);
             
            swap(i,index,nums);
        }
    }
    public void swap(int x,int y,int[] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}