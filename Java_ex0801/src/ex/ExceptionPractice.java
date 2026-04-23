package ex;

public class ExceptionPractice {
	public static void main(String[] args) {
		int[] intArray = { 10, 25, 4, 67, 100 };
		int index = 10;

		try {
			// 配列アクセス時の例外監視
			System.out.println("指定された配列の要素：" + intArray[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// 範囲外アクセスの例外をキャッチ
			System.out.println(e);
		}
		// 終了処理
		System.out.println("プログラムを終了します");

	}
}