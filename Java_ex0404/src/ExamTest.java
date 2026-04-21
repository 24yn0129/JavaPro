public class ExamTest {
    public static void main(String[] args) {
        if (Examination.judge(70)) {
            System.out.println("筆記試験：合格");
        } else {
            System.out.println("筆記試験：不合格");
        }

        if (Examination.judge(69)) {
            System.out.println("筆記試験：合格");
        } else {
            System.out.println("筆記試験：不合格");
        }
    }
}