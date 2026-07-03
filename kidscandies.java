import java.util.*;
class Main {
    public List<Boolean> kidswithcan(int [] candies , int ecandies){
        int max = 0;
        for(int candy:candies){
            if(candy>max){
                max = candy;
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int candy:candies){
            res.add(candy+ecandies >= max);
        }
        return res;
    }
    public static void main (String[]args){
        Main solution = new Main();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = solution.kidswithcan(candies, extraCandies);
        System.out.println(result);

    } 
}