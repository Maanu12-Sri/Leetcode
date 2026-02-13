// Last updated: 2/13/2026, 11:24:02 AM
class Solution {
    public boolean isValid(String s) {
     
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('|| c=='{' || c=='['){
                st.push(c);
            }
            else if(st.isEmpty()){
                return false;
            }else{
                char ch=st.peek();
                if ((c == ')' && ch == '(') || (c == ']' && ch == '[') || (c == '}' && ch == '{')) {
                    st.pop();
                }else{
                    return false;
                }
            }
            }
            return st.isEmpty();
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Solution solution = new Solution();
        boolean result = solution.isValid(s);
    }
}