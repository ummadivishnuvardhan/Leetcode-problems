class Solution {
    public boolean isHappy(int n) {
       int fast=n;
       int slow=n;
       do{
         slow=findSquare(slow);
         fast=findSquare(findSquare(fast));
       }while(slow!=fast);
       if(slow==1){
        return true;
       }
       return false;
    }

    public int findSquare(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }
}