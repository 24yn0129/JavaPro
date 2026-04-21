public class ExamTest {
    public static void main(String[] args) {
        int score = 70;
        String grade = "B";

        if (Examination.judge(score)) {
            System.out.println("筆記試験：合格");
        } else {
            System.out.println("筆記試験：不合格");
        }

        if (Examination.judge(grade)) {
            System.out.println("実技試験：合格");
        } else {
            System.out.println("実技試験：不合格");
        }

        if (Examination.judge(score, grade)) {
            System.out.println("総合判定：合格");
        } else {
            System.out.println("総合判定：不合格");
        }
    }
}