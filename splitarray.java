import java.util.*;
class SubarrayPartitioner {
    public int countPartitions(int[] a, int maxSum) {
        int partitions = 1;
        long subarraySum = 0;
        for (int num : a) {
            if (subarraySum + num <= maxSum) {
                subarraySum += num;
            } else {
                partitions++;
                subarraySum = num;
            }
        }
        return partitions;
    }
    public int largestSubarraySumMinimized(int[] a, int k) {
        int low = Arrays.stream(a).max().getAsInt(); // largest element
        int high = Arrays.stream(a).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(a, mid);

            if (partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        SubarrayPartitioner sp = new SubarrayPartitioner();
        int ans = sp.largestSubarraySumMinimized(a, k);
        System.out.println("The answer is: " + ans);
    }
}
