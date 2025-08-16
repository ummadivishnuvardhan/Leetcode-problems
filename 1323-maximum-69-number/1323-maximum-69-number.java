class Solution {
    public int maximum69Number (int num) {
        int max=Integer.MIN_VALUE;
        
        String s=Integer.toString(num);
        int n=s.length();
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            arr[i]=ch;
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]=='9'){
                
            }
            else{
                arr[i]='9';
            
            StringBuilder str=new StringBuilder();
            for(int j=0;j<n;j++){
                str.append(arr[j]);
            }
            max=Math.max(max,Integer.parseInt(str.toString()));
            break;
            }
        }
        return max=max!=Integer.MIN_VALUE?max:num;
    }
}