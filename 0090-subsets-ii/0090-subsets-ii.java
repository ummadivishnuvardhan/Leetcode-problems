class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,res,al,0);
        return res;
    }
    public void subset(int[] nums,List<List<Integer>> res,List<Integer> al,int count){
        if(count==nums.length){
            if(res.contains(al)){
                return;
            }
            else{
                res.add(new ArrayList<>(al));
                return;
            }
        }

        al.add(nums[count]);
        subset(nums,res,al,count+1);
        al.remove(al.size()-1);
        //  while (count + 1 < nums.length && nums[count] == nums[count + 1]) {
        //     count++;
        // }
        subset(nums,res,al,count+1);
    }
}