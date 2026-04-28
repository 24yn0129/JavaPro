package ex;

import java.util.Scanner;

/**
 * 入力の練習クラス.
 */

public class ScanPractice {

	/**
	 * main メインメソッド.
	 * @param args 未使用.
	 */
	public static void main(String[] args) {


		try (Scanner scanner = new Scanner(System.in)) {

			//quitが入力されるまで無限ループ.
			while (true) {
				System.out.print("文字列を入力してください：");
				//input に入力
				String input = scanner.nextLine();

				// quitが入力されたらループを抜ける
				if (input.equals("quit")) {
					System.out.println("プログラムを終了します");
					break;
				}

				System.out.println("入力された値は、『" + input + "』です。");
			}
		}
	}
}