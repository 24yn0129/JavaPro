package ordersystem;

/**
 * テーブルごとのメニューと注文を管理するクラスです.
 */
public class Table {
    // メニュー.
    private Menu menu;
    // 注文（未注文の場合はnull）.
    private Order order;

    /**
     * 指定されたメニューでTableを初期化します.
     * @param menu 利用するメニュー.
     */
    public Table(Menu menu) {
        this.menu = menu;
    }

    /**
     * 指定された商品番号の商品を注文に追加します.
     * @param itemNo 商品番号.
     */
    public void addOrder(int itemNo) {
        if (this.order == null) {
            this.order = new Order();
        }
        Item item = this.menu.getItem(itemNo);
        this.order.add(item);
    }

    /**
     * showOrderメソッド.
     * テーブルの注文履歴を表示します.
     */
    public void showOrder() {
        if (this.order == null) {
            System.out.println("注文が無いため、注文履歴を表示できません");
        } else {
            this.order.show();
        }
    }

    /**
     * payOrderメソッド.
     * 受け付けた注文を精算し、テーブルの注文状態をリセットします.
     */
    public void payOrder() {
        if (this.order == null) {
            System.out.println("注文が無いため、精算できません");
        } else {
            System.out.println("~~~お会計~~~");
            this.order.show();
            System.out.println("~~~精算が完了しました~~~");
            this.order = null;
        }
    }
}

