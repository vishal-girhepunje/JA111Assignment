package YouActivity2;

public class FeeMain {
	public static void main(String[] args) {
		FeeExpenses fee1 = new FeeExpenses(10000.0, 12.5);
		FeeWithCess fee2 = new FeeWithCess(12000.0, 15.0, 2.0);

		System.out.println("Total Fee without Cess: INR " + fee1.getTotalFee());
		System.out.println("Total Fee with Cess: INR " + fee2.getTotalFee());
	}
}
