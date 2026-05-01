import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 生徒テストクラス.
 */

public class StudentTest {

	/**
	 * main メインメソッド.
	 * @param args 未使用.
	 */
	public static void main(String[] args) {

		String name; //名前.
		int score;		//点数.
		int total = 0; //合計点.
		double avg; //平均点.
		int cnt = 0;
		Map<String, Integer> map = new HashMap<>();

		// Scannerはwhileの外で1回だけ生成し、最後に閉じる
		try (Scanner sc = new Scanner(System.in)) {

			while (true) { //ここから無限ループ.
				try {
					System.out.print("名前を入力してください(Enterで終了) : ");
					name = sc.nextLine();

					//nameが空だったら抜ける
					if (name.isEmpty()) {
						System.out.println("--------------------------------------------------");
						break;
					}

					//mapの中のKeyと名前が一致してた場合
					if (map.containsKey(name)) {
						System.out.println("【更新】" + name + "さんは既に"
								+ "登録されています。点数を上書きします。");
						cnt--;
					}

					System.out.print(name + "さんの点数を入力してください   : ");
					// nextInt()だと改行文字が残って次回のnextLine()がスキップされるため、
					// lineごと読み取ってから数値に変換
					score = Integer.parseInt(sc.nextLine());

					//合計点に足していく。
					total += score;
					//ここでmapに追加
					map.put(name, score);
				} catch (NumberFormatException e) {
					System.out.println("エラー：半角数字で入力してください。");
				}
			}
		} // ここでScannerが自動的に閉じられる

		System.out.println("合計点は" + total + "点です。");

		//double型でキャストしてtotal/mapのながさをする
		avg = (double) total / (map.size() - cnt);

		System.out.println("平均点は" + avg + "点です。");

		//Collectionsのmaxメソッドを使ってmap.valueを比較してもらう
		int max = Collections.max(map.values());
		String maxName = "";

		int min = Collections.min(map.values());
		String minName = "";

		//拡張for文でminとmaxの名前をもらう.
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				maxName = entry.getKey();
			}
			if (entry.getValue() == min) {
				minName = entry.getKey();
			}
		}
		//ここから最高点などを出力
		System.out.println("最高点は" + maxName + "さんの" + max + "点です。");

		System.out.println("最高点は" + minName + "さんの" + min + "点です。");

		System.out.println("--------------------------------------------------");

		System.out.println("最高点・最小点を除いた一覧を表示");

		// 最大点と最小点を除いた結果の表示
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (!minName.equals(entry.getKey()) && !maxName.equals(entry.getKey())) {
				System.out.println(entry.getKey() + "さんの点数: " + entry.getValue());
			}
		}
	}
}
