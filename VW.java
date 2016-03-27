package Car;

public abstract class VW extends CarOne{
	
	

	public VW(float FuelInTank, String chassisNumber) {
		super(FuelInTank, chassisNumber);
	}
	public VW( float fuelTankSize, String fuelType, int numberOfGears){
		super(fuelTankSize, fuelType, numberOfGears);
	}
	abstract float ConsumptionLevel(double DistanceDrivenInKM, int gear);
	
}