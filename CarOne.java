package Car;


public abstract class CarOne implements Vehicle {
	
	
	private String chassisNumber;
	private final float fuelTankSize;
	protected final String FuelType;
	protected final int numberOfGears;
	public float ConsumptionLevel;
	private float FuelInTank;
	private float currentConsumption;
	private int gear;
	private double DistanceDriveInKM;
	private int currentGear;

	
	
	public Car(float availableFuelInTank, String chassisNumber, float fuelTankSize, int numberOfGears, float ConsumptionLevel) {
		this.FuelInTank = FuelInTank;
		this.chassisNumber = chassisNumber;
		this.fuelTankSize = fuelTankSize;
	    this.numberOfGears = numberOfGears;
		this.ConsumptionLevel = ConsumptionLevel;

	}
	
	public void chassisNumber(String chassisNumber){
		this.chassisNumber = chassisNumber;
	}
	
	
	public String getchassisNumber(){
		return chassisNumber;
	}
	
	
	public int getGear(){
		return gear;
	}
	
	public void shiftGear(int gear) {
		this.gear = gear;
		System.out.println("You have switched the gear to "+this.gear+ " gear.");
	}
	
	public int getCurrentGear(){
		return currentGear;
	}


	public float getCurrentConsumption(){
		return currentConsumption;
	}
	
	public float getConsumptionLevel(){
		return ConsumptionLevel;
	}
	
	public void setCurrentConsumption(float currentConsumption){
		this.currentConsumption = currentConsumption;
	}
	
	
	public enum FuelType {
		   Diesel,Gas,Petrol
    }
	public String getFuelType() {
		return FuelType;
	}


	
	
	public float getFuelTankSize(){
		return fuelTankSize;
	}
	public float getAvailableFuel(){
		return FuelInTank;
	}
	
	public void setAvailabeFuel(float availabeFuel){
		this.FuelInTank = availabeFuel;
	}

	
	private void getCurrentFuelLevel(){
		float fuel = FuelInTank- getCurrentConsumption();
		setAvailabeFuel(fuel);
		System.out.println("You've got only " +fuel+ " liters of "+ this.getFuelType()+ " available.");
	}
	
	public float getAverageFuelConsumption() {
		float averageFuelConsumption = (float) (this.getCurrentConsumption() / this.DistanceDriveInKM*100);
		return averageFuelConsumption;
	}
	
	
	
	
	@Override
	public void start(){
		System.out.println(	"The car is ON " + getAvailableFuel() + " liters of " + this.getFuelType());
	    this.setCurrentConsumption(currentConsumption);
	}
	
	@Override
	public void drive(double numberOfKm){
		float consumption = this.getCurrentConsumption() + ConsumptionLevel(DistanceDriveInKM, this.getCurrentGear());
		this.setCurrentConsumption(consumption);
		double km = this.DistanceDriveInKM;
		this.setCurrentKm(km);
	}



	private void setCurrentKm(double km) {
	
	}

	@Override
	public void stop(){
		this.getCurrentFuelLevel();

		
	}
	
	abstract float ConsumptionLevel(double DistanceDriveiInKM, int gear);
}