package ro.sci.test.bookstore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.sci.BookStore.Customer;


public class TestCustomer {
	private Customer customer1;
	
		public Customer Customer(String CustomerName, String CustomerAddress, String CustomerEmail, int CustomerCart) {
			Customer customer = new Customer();
			customer.setCustomerAddress(CustomerAddress);
			customer.setCustomerCart(CustomerCart);
			customer.setCustomerName(CustomerName);
			customer.setCustomerEmail(CustomerEmail);
			return customer;
		
	}
	  
	
	  
		@Before
		public void initCustomer() {
			customer1 = new Customer("lalalal");
			//customer = new ArrayList<Customer>();
			//customer = AddNewCustomer("Cret Marian Darius", "Teodor Mihali 39 Cluj Napoca", "darius.marian96@gmail.com", 2);

		}

		
	

		@Test
		public void testCustomerContent() {
			Customer customer = new Customer();
			assertEquals("Cret Darius Marian", customer1.getCustomerName());
			assertNotEquals(3, customer1.getCustomerCart());
			assertEquals("Teodor Mihali", customer1.getCustomerAddress());
			assertNotEquals(3, customer1.getCustomerCart());
		}

		

		@After
		public void Destroy() {
			customer1 = null;
		}

}