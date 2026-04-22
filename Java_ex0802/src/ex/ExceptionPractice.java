package ex;

public class ExceptionPractice {
    public static void main(String[] args) {
        String str = "ABC";

        try {
            // 数値変換時の例外監視
            int value = Integer.parseInt(str);
            System.out.println("valueの二乗：" + (value * value));
        } catch (NumberFormatException e) {
            // 変換不能な文字列の例外をキャッチ
            System.out.println(e);
        } finally {
            // 終了処理
            System.out.println("プログラムを終了します");
        }
    }
}