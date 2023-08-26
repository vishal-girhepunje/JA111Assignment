package Assignment4;

public class ZiaConstructionsLimited {
	double getTotalCost(double totalArea, double labourCharges) {
        return totalArea * labourCharges;
    }

    double getTotalCost(double totalArea, double labourCharges, double materialCharges) {
        return (totalArea * labourCharges) + (totalArea * materialCharges);
    }
}
