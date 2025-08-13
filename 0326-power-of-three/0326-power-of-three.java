class Solution {
    public boolean isPowerOfThree(int n) {
        while(n>0){
            if(n==1){
                return true;
            }
            n=n/3;
        }
        return false;
    }
}