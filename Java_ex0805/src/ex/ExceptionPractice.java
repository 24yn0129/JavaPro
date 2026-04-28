package ex;


/**
 * 例外処理練習クラス.
 */
public class ExceptionPractice {

<<<<<<< HEAD
	/**
	 * main メインメソッド.
	 * @param args 未使用.
	 */
	public static void main(String[] args) {
		
		byte num1 = 50;
		byte num2 = 50;
=======
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
>>>>>>> 64ffa7ae758a6f9ceffb32660954ecc6a19aa0e2

		try {
			// 自作メソッドの呼び出しと例外監視
			byte result = add(num1, num2);
			System.out.println("計算結果：" + result);
		} catch (ArithmeticException e) {
			// byteの範囲を超えた際の例外をキャッチ
			System.out.println(e.getMessage());
		} finally {
			// 終了処理
			System.out.println("プログラムを終了します");
		}
	}

	/**
	 * 二つのbyte型整数の合計を返します.
	 * @param num1 1つめの引数として num1 をbyte型でもらう.
	 * @param num2 2つめの引数として num2 をbyte型でもらう. 
	 * @return byte型にキャストして result を返す.
	 * @throws ArithmeticException 結果がbyteの範囲を超える場合、例外をスローします.
	 */
	static byte add(byte num1, byte num2) throws ArithmeticException {
		int result = num1 + num2;
		// byteの許容範囲（-128〜127）をチェック
		if (result < -128 || 127 < result) {
			// 独自メッセージを添えて例外を投げる
			throw new ArithmeticException("計算結果がbyteの範囲を超えています");
		}
		return (byte) result;
	}
}