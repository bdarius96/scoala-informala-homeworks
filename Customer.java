package ro.sci.BookStore;

public class Customer {
	private String customerName;
	private String customerAddress;
	private String customerEmail;
	private int customerCart;
	


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress= customerAddress;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getCustomerCart() {
		return customerCart;
	}

	public void setCustomerCart(int customerCart) {
		this.customerCart = customerCart;
	}

	
}