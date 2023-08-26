package YouActivity3;

public class BoatTicketIssue {
	static boolean issueTicket(Passenger passenger, SpeedBoat speedBoat) {
        if (speedBoat.getCapacity() > 0) {
            passenger.setSpeedBoat(speedBoat);
            speedBoat.setCapacity(speedBoat.getCapacity() - 1);
            return true;
        }
        return false;
    }

    static boolean issueTicket(Passenger passenger, MotorBoat motorBoat) {
        if (motorBoat.getCapacity() > 0) {
            passenger.setMotorBoat(motorBoat);
            motorBoat.setCapacity(motorBoat.getCapacity() - 1);
            return true;
        }
        return false;
    }
}
