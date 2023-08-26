package Assignment4;

public class ZiaConstructionsLimitedTester {
	public static void main(String args[]) {
        ZiaConstructionsLimited zcl = new ZiaConstructionsLimited();

        // Calculate total cost with only labour charges
        double totalCostLabour = zcl.getTotalCost(1000, 250);
        System.out.println("Your total bill is: " + totalCostLabour);

        // Calculate total cost with labour and material charges
        double totalCostLabourMaterial = zcl.getTotalCost(1000, 250, 350);
        System.out.println("Your total bill is: " + totalCostLabourMaterial);
    }
}
