import java.util.*;
class Solution{    
    public int countSubarrays(int[] nums, int k) {
        Map<Integer, Integer> prefixSumOfBalance = new HashMap<>();
        prefixSumOfBalance.put(0, 1); // Dummy value of 0's frequency is 1.
        int ans = 0, runningBalance = 0;
        boolean found = false;
        for (int num : nums) {
            if (num < k) {
                --runningBalance;
            }else if (num > k) {
                ++runningBalance;
            }else {
                found = true;
            }
            if (found) {
                ans += prefixSumOfBalance.getOrDefault(runningBalance, 0) + prefixSumOfBalance.getOrDefault(runningBalance - 1, 0);
            }else {
             // prefixSumOfBalance.merge(runningBalance, 1, Integer::sum); // Similar to the following statement, but it is shorter.
                prefixSumOfBalance.put(runningBalance, prefixSumOfBalance.getOrDefault(runningBalance, 0) + 1);
            }
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sub");
        int k = sc.nextInt();
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the array of elements");
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        System.out.println(sol.countSubarrays(nums,k));
    }
}
