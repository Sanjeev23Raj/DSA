import java.util.Scanner;
class RevString{
    public static String vowelsreverse(String s){
        char [] arr = s.toCharArray();
        int i=0;int j=arr.length-1;
        while(i<j){
            if(!isVowel(arr[i])){
                i++;
            }
            else if(!isVowel(arr[j])){
                j--;
            }
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        String res = new String(arr);
        return res;
    }
    public static boolean isVowel(char ch){
        char c = Character.toLowerCase(ch);
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = vowelsreverse(s);
        System.out.println(result);
    }
}