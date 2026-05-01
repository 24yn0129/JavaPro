package ordersytem;

import java.util.ArrayList;
import java.util.List;

/**
 * 注文された商品を管理するクラスです.
 */
public class Order {
    // 注文された商品のリスト.
    private List<Item> orderedItemList;

    // Orderを初期化します.
    public Order() {
        this.orderedItemList = new ArrayList<Item>();
    }

    /**
     * 注文リストに商品を追加します.
     * @param item 追加する商品.
     */
    public void add(Item item) {
        this.orderedItemList.add(item);
    }

    /**
     * 注文された商品の合計金額を計算して取得します.
     * @return 合計金額.
     */
    public int getTotalAmount() {
        int total = 0;
        for (Item item : this.orderedItemList) {
            total += item.getPrice();
        }
        return total;
    }

    /**
     * showメソッド.
     * 注文された商品の一覧と合計金額を表示します.
     */
    public void show() {
        for (Item item : this.orderedItemList) {
            item.show();
        }
        System.out.println("合計金額:\\" + this.getTotalAmount());
    }
}

