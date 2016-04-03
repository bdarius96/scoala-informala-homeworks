package ro.sci.BookStore;

public class CartEntry {
		private Book book;
		private int Quantity;

		public CartEntry(Book book, int quantity) {
			this.book = book;
			this.Quantity = quantity;
		}
		
		public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}

		public int getOrderedQuantity() {
			return Quantity;
		}

		public void setQuantity(int Quantity) {
			this.Quantity = Quantity;
		}

	}