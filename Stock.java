package ro.sci.BookStore;

public class Stock {
	private Book book;
	private int stockQuantity;

	public Stock(Book book, int stockQuantity) {
		this.book = book;
		this.stockQuantity = stockQuantity;
		
		}
	public Stock(int stockQuantity){
		super();
	}
	public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}

		public int getStockQuantity() {
			return stockQuantity;
		}

		public void setStockQuantity(int stockQuantity) {
			this.stockQuantity = stockQuantity;
		}
	
	
	} 


