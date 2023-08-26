package WEActivity5;

public class Customer {
	String customerId;
	String customerName;
	long contactNumber;
	Address address;

	public Customer(String customerId, String customerName, long contactNumber, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	void showCustomerDetails() {
		System.out.println("Displaying customer details");
		System.out.println("Customer Id: " + this.customerId);
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Contact Number: " + this.contactNumber);
		System.out.println("Address: " + ("Door No: " + address.getDoorNo() + "," + address.getStreet() + ", "
				+ address.getCity() + ", " + address.getZipcode()));
		System.out.println();
	}
}
