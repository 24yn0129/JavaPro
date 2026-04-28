package ordersystem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Item> itemList;

    public Menu() {
        this.itemList = new ArrayList<Item>();
    }

    public void add(Item item) {
        this.itemList.add(item);
    }

    // 追加：指定された商品番号の商品を返すメソッド
    public Item getItem(int itemNo) {
        return this.itemList.get(itemNo);
    }

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

