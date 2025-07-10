class Solution {
   
    public int numberOfSteps(int num) {
        return Steps(num,0);
    }
    public int Steps(int num,int count){
        if(num==0){
            return count;
        }
        else if(num%2==0){
            
            return Steps(num/2,++count);
        }
        else{
            
            return Steps(--num,++count);
        }
    }
}