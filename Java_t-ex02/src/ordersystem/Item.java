package ordersystem;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 追加：価格を取得するゲッター
    public int getPrice() {
        return this.price;
    }

    public void show() {
        System.out.println(this.name + ":\\" + this.price);
    }
}

