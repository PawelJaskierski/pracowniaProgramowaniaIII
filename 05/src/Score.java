import java.util.Arrays;

public class Score {
    int[] ratings;
    public Score(int[] ratings){
        this.ratings = ratings;
    }
    public int calculateFinalScore(){
        int sum = 0;
        Arrays.sort(ratings);
        for (int i = 1; i < ratings.length-1; i++){
            sum += ratings[i];
        }
        return sum/(ratings.length-2);

    }
    public static void main(String[] args){
        Score s1 = new Score(new int[]{1,2,3,4,5});
        System.out.println(s1.calculateFinalScore());
        Score s2 = new Score(new int[]{5,4,3,7,1});
        System.out.println(s2.calculateFinalScore());
    }
}
