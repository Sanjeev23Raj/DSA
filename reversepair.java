import java.util.*;
class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
    private static void merge(int arr[],int low ,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }
        while(left<=mid){
            temp.add(arr[left++]);
        }
        while(right<=high){
            temp.add(arr[right++]);
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
       private static int CountPairs(int[] nums, int low, int mid, int high) {
       int cnt = 0;
       int right = mid + 1;
       for (int i = low; i <= mid; i++) {
           while (right <= high && (long) nums[i] > 2L * nums[right]) {
               right++;
           }
           cnt += (right - (mid + 1));
       }
       return cnt;
   }
   private static int mergesort(int nums[],int low,int high){
    if(low>=high) return 0;
    int mid = (low+high)/2;
    int cnt = mergesort(nums,low,mid);
    cnt += mergesort(nums,mid+1,high);
    cnt += CountPairs(nums,low,mid,high);
    merge(nums,low,mid,high);
    return cnt;
   }
   public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the array of elements");
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        System.out.println(sol.reversePairs(nums));
    }
}