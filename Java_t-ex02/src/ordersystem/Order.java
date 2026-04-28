package ordersystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> orderedItemList;

    // コンストラクタでリストを初期化
    public Order() {
        this.orderedItemList = new ArrayList<Item>();
    }

    // 注文リストに商品を追加
    public void add(Item item) {
        this.orderedItemList.add(item);
    }

    // 合計金額を計算して返す
    public int getTotalAmount() {
        int total = 0;
        // リストの中身を一つずつ取り出して価格を足していきます
        for (Item item : this.orderedItemList) {
            total += item.getPrice();
        }
        return total;
    }

    // 注文内容と合計金額を表示
    public void show() {
        // 注文された商品が存在しない場合はループが回らないので、合計金額だけ表示されます
        for (Item item : this.orderedItemList) {
            item.show();
        }
        System.out.println("合計金額:\\" + this.getTotalAmount());
    }
}

