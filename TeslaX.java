package Car;

public class TeslaX extends TESLA {
	
	private int Speakers;

	public TeslaX(int FuelInTank,String chassisNumber) {
		super(chassisNumber, FuelInTank);

	}

	public TeslaX(String chassisNumber, int FuelInTank, int Speakers) {
		super(chassisNumber, FuelInTank);
		this.Speakers = Speakers;
	}

	public int getSpeakers() {
		return Speakers;
	}

	public void setSpeakers(int Speakers) {
		this.Speakers = Speakers;
	}

}

