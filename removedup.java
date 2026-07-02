import java.util.*;
class Solution{
    public static int removedup(int [] nums){
        int index = 0;
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(!seen.contains(num)){
                seen.add(num);
                nums[index] = num;
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        Solution sol = new Solution();
        int k = sol.removedup(nums);

        System.out.println("k = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}