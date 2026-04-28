package ordersystem;

public class Table {
    private Menu menu;
    private Order order; // 初期値は null になります

    // コンストラクタ
    public Table(Menu menu) {
        // 引数で渡されたメニューをフィールドにセットします
        this.menu = menu;
    }

    // 注文を追加するメソッド
    public void addOrder(int itemNo) {
        // 初回の注文だった場合（フィールド order が null だった場合）
        if (this.order == null) {
            // ここで初めて Order のインスタンスを生成します
            this.order = new Order();
        }
        
        // メニューから商品番号を指定して商品（Item）を取得
        Item item = this.menu.getItem(itemNo);
        // 取得した商品をオーダーに追加
        this.order.add(item);
    }

    // 注文履歴を表示するメソッド
    public void showOrder() {
        // まだ一度も注文されておらず、オーダー表がない場合
        if (this.order == null) {
            System.out.println("注文が無いため、注文履歴を表示できません");
        } else {
            // 注文がある場合は、Order クラスの show() メソッドに表示を任せます
            this.order.show();
        }
    }
}

