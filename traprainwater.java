import java.util.*;
class Solution {
    public int findhei(int []hei){
        int n = hei.length;
        int leftmax = 0;    
        int rightmax = 0;
        int totalwater = 0;
        int start = 0;
        int end = n-1;
        while(start<=end){
            leftmax = Math.max(leftmax,hei[start]);
            rightmax = Math.max(rightmax,hei[end]);
            if(leftmax<rightmax){
                totalwater += leftmax-hei[start];
                start++;
            }
            else{
                totalwater += rightmax-hei[end];
                end--;
            }
        }
        return totalwater;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int []hei = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = sol.findhei(hei);
        System.out.println(result);
    }
}