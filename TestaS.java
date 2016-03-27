package Car;

public class TeslaX extends TESLA {
	
	private int HorsePower;

	public TeslaX(int FuelInTank,String chassisNumber) {
		super(chassisNumber, FuelInTank);

	}

	public TeslaX(String chassisNumber, int FuelInTank, int HorsePower) {
		super(chassisNumber, FuelInTank);
		this.HorsePower = HorsePower;
	}

	public int getSpeakers() {
		return HorsePower;
	}

	public void setSpeakers(int HorsePower) {
		this.HorsePower = HorsePower;
	}

}
