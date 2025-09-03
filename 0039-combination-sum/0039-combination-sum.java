class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> l=new ArrayList<>();
          List<Integer> al=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,l,al,0);
        return l;
    }
    public void helper(int[] nums,int target,List<List<Integer>> l,List<Integer> al,int count){
     
        if(count==nums.length){
            if(target==0){
                l.add(new ArrayList<>(al));
                return;
            }
            return;
        }
     if(nums[count]<=target){
        al.add(nums[count]);
        helper(nums,target-nums[count],l,al,count);
        al.remove(al.size()-1);
     }
     helper(nums,target,l,al,count+1);
           
    }
}