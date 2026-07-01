import java.util.*;
public class Search {
    public static int searchInsert(int[] arr, int m) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= m) {
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(searchInsert(arr, m));
        sc.close();
    }
}