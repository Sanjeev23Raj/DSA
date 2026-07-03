import java.util.*;
class linear{
    public static int search(int n, int arr[], int num){
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int n=5;
        int [] arr = {1,2,3,4,5};
        int num = 3;
        int result = search(n,arr,num);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+result);
        }
    }
}