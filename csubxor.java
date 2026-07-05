import java.util.*;
class Solu{
    public int countsubarray(int nums[], int k){
        Map<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);
        int preXor = 0;
        int count =0;
        for(int num:nums)
        {
            preXor ^=num;
            int target = preXor ^k;
            if(freq.containsKey(target))
            {
                count += freq.get(target);
            }
            freq.put(preXor,freq.getOrDefault(preXor,0)+1);
        }
        return count;
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
        Solu sol = new Solu();
        System.out.println(sol.countsubarray(nums,k));
    }
}