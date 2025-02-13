class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;
        int a = 0;
        int b = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<tokens.length; i++) {
            if(tokens[i].equalsIgnoreCase("+")) {
                a = st.pop();
                b = st.pop();
                st.push(a+b);
            }
            else if(tokens[i].equalsIgnoreCase("-")) {
                a = st.pop();
                b = st.pop();
                st.push(b-a);
            }
            else if(tokens[i].equalsIgnoreCase("/")) {
                a = st.pop();
                b = st.pop();
                st.push(b/a);
            }
            else if(tokens[i].equalsIgnoreCase("*")) {
                a = st.pop();
                b = st.pop();
                st.push(b*a);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}