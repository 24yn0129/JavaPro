package ordersystem;

public class Main {
    public static void main(String[] args) {
        // --- ここから総合演習1の処理 ---
        Menu menu = new Menu();
        menu.add(new Item("チーズINハンバーグ", 680));
        menu.add(new Item("ミックスフライ", 650));
        menu.add(new Item("シーフードドリア", 550));
        menu.add(new Item("和風明太パスタ", 450));
        menu.add(new Item("ミックスピザ", 520));
        
        menu.show();
        // --- ここまで総合演習1の処理 ---

        // --- ここから総合演習2の処理 ---
        Order order = new Order();
        
        // 注文がない状態での表示（合計金額:\0 になるはずです）
        order.show();
        
        // 実行イメージを見ると改行が一つ入っているので追加しておきます
        System.out.println(); 

        // 0番の商品（チーズINハンバーグ）をメニューから取得して注文
        Item item1 = menu.getItem(0);
        order.add(item1);

        // 3番の商品（和風明太パスタ）をメニューから取得して注文
        Item item2 = menu.getItem(3);
        order.add(item2);

        // 注文後の状態を表示
        order.show();
    }
}

