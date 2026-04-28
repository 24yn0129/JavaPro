package ex;

/**
 * 
 * 例外処理練習クラス.
 */
public class ExceptionPractice {

	/**
	 * main メインメソッド.
	 * 
	 * @param args 一つだけ使用.
	 */
	public static void main(String[] args) {
		int[] intArray = { 10, 25, 4, 67, 100 };

		try {
			// コマンドライン引数を数値に変換し、配列要素を表示
			int index = Integer.parseInt(args[0]);
			System.out.println("指定された配列の要素：" + intArray[index]);
		} catch (NumberFormatException e) {
			// 数値以外の入力（ABCなど）をキャッチ
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			// 配列の範囲外（12など）をキャッチ
			System.out.println(e);
		} finally {
			// 終了処理
			System.out.println("プログラムを終了します");
		}
	}

}
