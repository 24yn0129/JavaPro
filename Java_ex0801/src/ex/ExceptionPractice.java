package ex;

/**
 * 例外処理練習クラス.
 * 
 */
public class ExceptionPractice {
<<<<<<< HEAD

	/**
	 * メインメソッド.
	 * @param args 未使用
	 */
	public static void main(String[] args) {
	
		int[] intArray = { 10, 25, 4, 67, 100 };
		int index = 10;

		/*
		 * try : エラーが発生する可能性のある処理
		 * catch : 実際にエラーが起きたらどう処理するか
		 */

=======
	public static void main(String[] args) {
		int[] intArray = { 10, 25, 4, 67, 100 };
		int index = 10;

>>>>>>> 64ffa7ae758a6f9ceffb32660954ecc6a19aa0e2
		try {
			// 配列アクセス時の例外監視
			System.out.println("指定された配列の要素：" + intArray[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// 範囲外アクセスの例外をキャッチ
			System.out.println(e);
<<<<<<< HEAD
		} finally {
			// 終了処理
			System.out.println("プログラムを終了します");
		}
=======
		}
		// 終了処理
		System.out.println("プログラムを終了します");
>>>>>>> 64ffa7ae758a6f9ceffb32660954ecc6a19aa0e2

	}
}