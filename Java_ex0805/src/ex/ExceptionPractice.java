package ex;

public class ExceptionPractice {
    public static void main(String[] args) {
        byte num1 = 80;
        byte num2 = 50;

        try {
            // 自作メソッドの呼び出しと例外監視
            byte result = add(num1, num2);
            System.out.println("計算結果：" + result);
        } catch (ArithmeticException e) {
            // byteの範囲を超えた際の例外をキャッチ
            System.out.println(e.getMessage());
        } 
            // 終了処理
            System.out.println("プログラムを終了します");
        
    }

    /**
     * 二つのbyte型整数の合計を返します。
     * 結果がbyteの範囲を超える場合、例外をスローします。
     */
    static byte add(byte num1, byte num2) {
        int result = num1 + num2;
        // byteの許容範囲（-128〜127）をチェック
        if (result < -128 || 127 < result) {
            // 独自メッセージを添えて例外を投げる
            throw new ArithmeticException("計算結果がbyteの範囲を超えています");
        }
        return (byte) result;
    }
}