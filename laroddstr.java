import java.util.*;
class Solution {
    public String largestOddNumber(String num) {
        int ind = -1;
        int i;
        for(i=num.length()-1;i>=0;i--){

            if((num.charAt(i)-'0') %2==1){
                ind=i;
                break;
            }
        }
        if(ind==-1) return "";
        i=0;
        while(i<=ind && num.charAt(i) =='0') i++;
        return num.substring(i,ind+1);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String num = "8825752798";
        String result = sol.largestOddNumber(num);
        System.out.println(result); // Output: "123456789"
    }
}