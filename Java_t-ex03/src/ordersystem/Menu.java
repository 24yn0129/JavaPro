package ordersystem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	List<Item> itemList = new ArrayList<>();

	Menu() {
		this.itemList = new ArrayList<>();
	}

	public void add(Item item) {
		this.itemList.add(item);
	}

	public Item getItem(int itemNo) {
		return this.itemList.get(itemNo);
	}

	public void show() {
		System.out.println("********************************");
		System.out.println("★取扱いメニュー★");
		for (int i = 0; i < this.itemList.size(); i++) {
			System.out.print(i + " ");
			this.itemList.get(i).show();
		}
		System.out.println("********************************");
	}
}
