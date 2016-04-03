package ro.sci.test.bookstore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import ro.sci.BookStore.Book;

import ro.sci.BookStore.CartEntry;
import ro.sci.BookStore.Stock;
public class TestCart {

	    List<CartEntry> cart = null;
        
		private Book book1,book2;
		private Stock stock1,stock2;
		private CartEntry cartEntry1,cartEntry2;
	

		@Before
		
		public void initAddCart(){
		cart = new ArrayList<CartEntry>();
        book1 = new Book(21312321, "A brief History of Time","Cosmology","Stephan Hawking",100, 55);
		stock1 = new Stock(12);
	    cartEntry1 = new CartEntry(book1, 10);
		cart.add(cartEntry1);
		
        book2 = new Book(3218221, "Parallel Worlds","Cosmology","Michio Kaku",50, 60);
		stock2 = new Stock(10);
	    cartEntry2 = new CartEntry(book2, 10);
		cart.add(cartEntry2);
		
		}
		

		@After
		public void destroyCart() throws Exception {
			book1 = null;
			stock1 = null;
			cartEntry1 = null;
		}

		

	
		@Test
		public void testCart(){
			assertTrue(null, true);
			assertNotNull(book1);
			//assertEquals("A brief History of Time,Cosmology,Stephan Hawking",book1);
			assertNotEquals("alalalal",book2);
			
			
		}
		
		
		
}

	
		