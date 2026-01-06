class Solution {
    public int removeDuplicates(int[] a) {
        if(a.length<2){
            return a.length; 
        }
       int l=0,r=1;
       while(r<a.length){
            if(a[l]!=a[r]){
                l++;
                a[l]=a[r];
            }
            r++;
       }
       return l+1;
    }
}