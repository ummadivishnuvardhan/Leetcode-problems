class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
       subset(nums,result,al,0);
       return result;
    }
    public void subset(int[] nums,List<List<Integer>> result,List<Integer> al,int count){
        if(count==nums.length){
            result.add(new ArrayList(al));
            return ;
        }
        al.add(nums[count]);
        subset(nums,result,al,count+1);
        al.remove(al.size()-1);
        subset(nums,result,al,count+1);
    }
}