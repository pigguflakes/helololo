package refactoring;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	Movie m1,m2,m3;
	Customer c1;
	Rental myRental;

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	public void setUp() throws Exception{
		m1 = new Movie("LOTR", 2);
		m2 = new Movie("RAID", 2);
		c1 = new Customer("Neha");
		c1.addRental(new Rental(m1,4));
		c1.addRental(new Rental(m2,4));
		c1.statement();
	}

}
