import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int freq[] = new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'A']--;
        }
        for(int i=0;i<256;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "anagram";
        String t = "nagaram";
        boolean result = sol.isAnagram(s, t);
        System.out.println(result); // Output: true
    }
}