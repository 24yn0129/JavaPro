package ex;

import java.io.IOException;

/**
 * 例外処理練習クラス.
 */
public class ExceptionPractice {
<<<<<<< HEAD

	/**
	 * メインメソッド.
	 *  @param  args 未使用.
	 */
	public static void main(String[] args) {
		try {
			// 文字入力メソッドの呼び出し
			outputChar();
			
		} catch (IOException e) {
			// 入出力エラーをキャッチ
			System.out.println("入出力エラーが発生しました。");
		} finally {
			// 終了処理
			System.out.println("プログラムを終了します");
		}
	}

	/**
	 * 文字の入力を受け付け、その文字の文字コードを出力するメソッドです.
	 * @throws IOException 入出力エラーが発生した場合.
	 */
	static void outputChar() throws IOException {
		throw new IOException(); // テスト用コード

	/*	System.out.print("文字を1文字入力してください：");
		int charCode = System.in.read();
		System.out.println("文字コードは、" + charCode + "です");*/
		
	}
=======
    public static void main(String[] args) {
        try {
            // 文字入力メソッドの呼び出し
            outputChar();
        } catch (IOException e) {
            // 入出力エラーをキャッチ
            System.out.println("入出力エラーが発生しました。");
        } 
            // 終了処理
            System.out.println("プログラムを終了します");
    }

    /**
     * 文字の入力を受け付け、その文字の文字コードを出力するメソッド。
     * @throws IOException 入出力エラーが発生した場合
     */
    static void outputChar() throws IOException {
        // throw new IOException(); // テスト用コード
        System.out.print("文字を1文字入力してください：");
        int charCode = System.in.read();
        System.out.println("文字コードは、" + charCode + "です");
    }
>>>>>>> 64ffa7ae758a6f9ceffb32660954ecc6a19aa0e2
}