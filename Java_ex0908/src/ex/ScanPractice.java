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

		//Scannerインスタンス化.
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("名前を入力してください：");

			//nameに入力
			String name = scanner.nextLine();

			System.out.println(name + "さん、こんにちは。");
		}
	}
} 