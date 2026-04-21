public class Examination {
    public static final int PERFECT_SCORE = 100;
    public static final int PASSING_SCORE = 70;

    public static boolean judge(int score) {
        if (score >= PASSING_SCORE) {
            return true;
        } else {
            return false;
        }
    }
}