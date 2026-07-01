import java.util.*;
class arrayissorted{
    public static boolean issorted(int []arr , int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int n = 3 ;
        int []arr = {2,5,8};
        System.out.println(issorted(arr,n));
    }
}