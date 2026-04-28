package ordersystem;

public class Main {
	public static void main(String[] args) {
		// Menuクラスのインスタンスを生成
		Menu menu = new Menu();

		// 商品を作成してメニューに追加
		menu.add(new Item("チーズINハンバーグ", 680));
		menu.add(new Item("ミックスフライ", 650));
		menu.add(new Item("シーフードドリア", 550));
		menu.add(new Item("和風明太パスタ", 450));
		menu.add(new Item("ミックスピザ", 520));

		// メニューを表示
		menu.show();
	}
}
