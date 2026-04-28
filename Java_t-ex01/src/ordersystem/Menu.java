package ordersystem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Item> itemList;

    // コンストラクタ
    public Menu() {
        // フィールド itemList を ArrayList で初期化します
        this.itemList = new ArrayList<Item>();
    }

    // メニューに商品を追加するメソッド
    public void add(Item item) {
        this.itemList.add(item);
    }

    // メニューを表示するメソッド
    public void show() {
        System.out.println("********************************");
        System.out.println("★取扱いメニュー★");
        
        // メニューに含まれる商品の数だけループします
        for (int i = 0; i < this.itemList.size(); i++) {
            // インデックス番号（行頭の数字）と空白を改行なしで表示します
            System.out.print(i + " ");
            // Itemクラスのshowメソッドを呼び出して、商品名と価格を表示（ここで改行されます）
            this.itemList.get(i).show();
        }
        
        System.out.println("********************************");
    }
}

