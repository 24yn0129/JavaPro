package ordersystem;

public class Item {

	private String name;
	private int price;
	
	Item(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void show() {
		System.out.println(this.name + ":\\" + this.price);
	}
}
