package ordersystem;

public class Item {
    private String name;
    private int price;

    // コンストラクタ
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 商品名と価格を表示するメソッド
    public void show() {
        System.out.println(this.name + ":\\" + this.price);
    }
}

