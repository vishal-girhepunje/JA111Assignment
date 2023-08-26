package Assignment3;

public class JoyInfocom {
	double getBillAmount(boolean usingCallService, boolean usingDataService, boolean usingSMSService) {
        double totalBill = 0;

        if (usingCallService) {
            totalBill += 300;
        }

        if (usingDataService) {
            totalBill += 125;
        }

        if (usingSMSService) {
            totalBill += 50;
        }

        return totalBill;
    }
}
