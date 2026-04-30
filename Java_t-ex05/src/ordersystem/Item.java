ppackage ordersystem;

/**
 * 商品を表すクラスです。
 */
public class Item {
    // 商品名
    private String name;
    // 価格
    private int price;

    /**
     * 指定された商品名と価格でItemを初期化します。
     * @param name  商品名
     * @param price 価格
     */
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * 商品の価格を取得します。
     * @return 商品の価格
     */
    public int getPrice() {
        return this.price;
    }

    // 商品名と価格をコンソールに表示します。
    public void show() {
        System.out.println(this.name + ":\\" + this.price);
    }
}

