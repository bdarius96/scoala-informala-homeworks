package Car;

public class Passat extends VW {
	
	private int HorsePower;

	public Up(int FuelInTank,String chassisNumber) {
		super(chassisNumber, FuelInTank);

	}

	public Up(String chassisNumber, int FuelInTank, int HorsePower) {
		super(chassisNumber, FuelInTank);
		this.HorsePower = HorsePower;
	}

	public int getHorsePower() {
		return HorsePower;
	}

	public void setHorsePower(int HorsePower) {
		this.HorsePower = HorsePower;
	}

}