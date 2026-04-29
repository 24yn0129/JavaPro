package ordersystem;

import java.util.ArrayList;
import java.util.List;

/**
 * メニューを管理するクラスです。
 */
public class Menu {
    // メニューに含まれる商品のリスト
    private List<Item> itemList;

    // Menuを初期化します。
    public Menu() {
        this.itemList = new ArrayList<Item>();
    }

    /**
     * メニューに商品を追加します。
     * @param item 追加する商品
     */
    public void add(Item item) {
        this.itemList.add(item);
    }

    /**
     * 指定された商品番号の商品を取得します。
     * @param itemNo 商品番号（インデックス）
     * @return 指定された商品
     */
    public Item getItem(int itemNo) {
        return this.itemList.get(itemNo);
    }

    // メニューに含まれるすべての商品を表示します。
    public void show() {
        System.out.println("********************************");
        System.out.println("★取扱いメニュー★");
        for (int i = 0; i < this.itemList.size(); i++) {
            System.out.print(i + " ");
            this.itemList.get(i).show();
        }
        System.out.println("********************************");
    }
}

