package ro.sci.BookStore;
import java.util.ArrayList;

public class Cart {
	private String list;
	private float Price;

	private ArrayList<CartEntry> cartEntryList = new ArrayList<CartEntry>();
    
	public Cart(String list, float price) {
		this.list = list;
		this.Price = price;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		this.Price = price;
	}
	public void add(CartEntry cartEntry){
		cartEntryList.add(cartEntry);
	}
}

