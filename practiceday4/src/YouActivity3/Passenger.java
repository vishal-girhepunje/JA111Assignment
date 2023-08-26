package YouActivity3;

public class Passenger {
	 private String passengerId;
	    private String name;
	    private SpeedBoat speedBoat;
	    private MotorBoat motorBoat;
	    private static int passengerCounter = 1000;

	    public Passenger(String name) {
	        this.name = name;
	        passengerCounter++;
	        this.passengerId = "PS" + passengerCounter;
	    }

	    public String getPassengerId() {
	        return passengerId;
	    }

	    public String getName() {
	        return name;
	    }

	    public SpeedBoat getSpeedBoat() {
	        return speedBoat;
	    }

	    public void setSpeedBoat(SpeedBoat speedBoat) {
	        this.speedBoat = speedBoat;
	    }

	    public MotorBoat getMotorBoat() {
	        return motorBoat;
	    }

	    public void setMotorBoat(MotorBoat motorBoat) {
	        this.motorBoat = motorBoat;
	    }
}
