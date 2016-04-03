package ro.sci.test.bookstore;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ro.sci.BookStore.Address;

	
	
	public class TestNameAddressTest {
	
		private Address address;

		
		@Before
	  public void initAddress() {

			address = new Address();
			address.setNameOfTheCity("Cluj");
			address.setStreet("Teodor Mihali");
			address.setNumberOfTheHouse(39);
			
			
		System.out.println("Addres is " +  address.getNameOfTheCity() +  address.getStreet()
					+  address.getNumberOfTheHouse());
			}


		@Test
		public void testAdressContent() {
			assertTrue(null, true);
			assertNotNull(address);
			assertEquals(39, address.getNumberOfTheHouse());
			assertNotEquals("Cluj" , "lalalala");
            assertEquals("Teodor Mihali", address.getStreet());
			assertNull(null);
			assertFalse(false);
		}
		@After
		public void DestroyAddress(){
			address = null;
		}

	}
