package refactoring;

public class RentalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1,m2,m3;
		Customer c1;
		Rental myRental;
		
		m1 = new Movie("LOTR", 2);
		m2 = new Movie("RAID", 2);
		c1 = new Customer("Neha");
		c1.addRental(new Rental(m1,4));
		c1.addRental(new Rental(m2,4));
		System.out.println(c1.statement());

	}

}
