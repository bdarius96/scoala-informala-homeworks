package Car;

public abstract class TESLA extends CarOne {
	
	public TESLA(float FuelInTank, String chassisNumber) {
		super(FuelInTank, chassisNumber);
	}
	public TESLA ( float fuelTankSize, String fuelType, int numberOfGears){
		super(fuelTankSize, fuelType, numberOfGears);
	}
	
	abstract float ConsumptionLevel(double DistanceDrivenInKM, int gear);
	
}
