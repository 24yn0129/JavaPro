package ordersystem;
/**
 * Itemクラス.
 */
public class Item {

	private String name;
	private int price;
	
	Item(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	static void show() {
		//System.out.println(name + ":\\" + price);
	}
}
