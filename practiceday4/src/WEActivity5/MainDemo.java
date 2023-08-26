package WEActivity5;

public class MainDemo {
	public static void main(String[] args) {
		Address address = new Address("D101", "Park Street", "Mumbai", 400404);
		Customer customer = new Customer("C101", "kapil", 9865326598L, address);
		customer.showCustomerDetails();
	}
}
