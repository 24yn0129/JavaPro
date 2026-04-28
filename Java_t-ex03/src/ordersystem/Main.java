package ordersystem;

public class Main {
    public static void main(String[] args) {
        // --- メニューの準備（ここまでは今までと同じです） ---
        Menu menu = new Menu();
        menu.add(new Item("チーズINハンバーグ", 680));
        menu.add(new Item("ミックスフライ", 650));
        menu.add(new Item("シーフードドリア", 550));
        menu.add(new Item("和風明太パスタ", 450));
        menu.add(new Item("ミックスピザ", 520));
        
        menu.show();
        // ----------------------------------------------------

        // テーブルを作成し、準備したメニューを渡します
        Table table = new Table(menu);
        
        // まだ注文していない状態で履歴を表示しようとします
        table.showOrder();
        
        // 2番の商品（シーフードドリア）を注文
        table.addOrder(2);
        
        // 4番の商品（ミックスピザ）を注文
        table.addOrder(4);
        
        // 注文後に履歴を表示します
        table.showOrder();
    }
}

