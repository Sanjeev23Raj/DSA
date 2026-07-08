import java.util.*;
class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        if(len<=2) return "";
        char c[] = s.toCharArray();
        StringBuilder newstrr = new StringBuilder();
        int o = 1;
        int ol = 0;
        for(int i=1;i<len;i++){
            if(c[i]=='('){
                o++;
                if(o>1) newstrr.append('(');
            }
            else{
                if(o>1) newstrr.append(')');
                o--;
            }
        }
        return newstrr.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "(()())(())";
        String result = sol.removeOuterParentheses(s);
        System.out.println(result); // Output: "()()()"
    }
}