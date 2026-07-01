import java.util.*;
class Solution{
    public static void smalllargest(int [] arr ,int n)
    {
        if(n<2){
            System.out.println("-1"+" "+"-1");
            return;
        }
        int small = Integer.MAX_VALUE , secondsmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE , secondlarge = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }

        for(int i=0;i<n;i++){
            if(arr[i]>small && arr[i]<secondsmall){
                secondsmall = arr[i];
            }
            if(arr[i]<large && arr[i]>secondlarge){
                secondlarge = arr[i];
            }
        }
        System.out.println("Second smallest element is: " + secondsmall);
        System.out.println("Second largest element is: " + secondlarge);
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = s.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        smalllargest(arr,n);
    }
}