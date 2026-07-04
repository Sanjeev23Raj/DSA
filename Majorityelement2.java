import java.util.*;
class Solution{
    public static List<Integer> majorityfind(int []arr){
        int n = arr.length;
        int cnt1 =0 , cnt2=0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cnt1==0 && arr[i]!=ele2){
                cnt1=1;
                ele1 = arr[i];
            }
            else if(cnt2==0 && arr[i]!=ele1){
                cnt2=1;
                ele2 = arr[i];
            }
            else if(arr[i]==ele1){
                cnt1++;
            }
            else if(arr[i]==ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        cnt1=0;cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele1) cnt1++;
            if(arr[i]==ele2) cnt2++;    
        }

        int mini = n/3 + 1;
        if(cnt1>=mini) res.add(ele1);
        if(cnt2>=mini && ele2!=ele1) res.add(ele2);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");  
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> result = majorityfind(arr);
        System.out.println(result);
    }
}