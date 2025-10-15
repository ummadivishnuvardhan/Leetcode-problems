class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'||ch==']'||ch=='}'){
                if(st.isEmpty()) return false;
                    char top=st.peek();
                    if(top=='('&&ch==')') st.pop();
                    else if(top=='{'&&ch=='}') st.pop();
                    else if(top=='['&&ch==']') st.pop();
                    else break;
                
            }
        }
        return st.isEmpty();
    }
}