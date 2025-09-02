class Solution {
    public double myPow(double x, int n) {
      long nn=0;
      if(n<0){
        nn=-n;
      }
      else{
        nn=n;
      }
      double res=pow(x,nn);
      if(n<0){
        return 1/res;
      }
      return res;
    }
    public double pow(double x,long n){
        if(n==0) return 1;
        double half=pow(x,n/2);
        if(n%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }
}