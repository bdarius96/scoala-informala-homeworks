package Car;

	
	public abstract class Car implements Vehicle {
		
		private String chassis; 
		private int gears;
	    protected int SelectedGear;
		protected float CurrentFuelAmount;
        private double DrivenDistance;
		private int gear;
		private int currentGear;
		private float Fuel;
		private float AverageFuelConsumption;

		
		
		public void setFuel(float fuel) {
			Fuel = fuel;
		}
		public String getchassis(){
				return chassis;
		}
	    public void setChassis(String chassis){
	    this.chassis = chassis;
			
		}
	    public int getGear(){
			return gear;
		}
	    public void shiftGear(int SelectedGear) {
	  	this.setSelectedGear(SelectedGear);
	  	System.out.println("Gear has been switched into" + SelectedGear);
	    }
		public int getCurrentGear(){
			return currentGear;
		}

	   
		public float getFuel(){
			return Fuel;
		
		}
		public String getFuelType(){
			return getFuelType();
		}
		public float getFuelConsumption() {
			return getFuelConsumption();
		}

		public void setFuelConsumption(float FuelConsumption) {
			this.FuelConsumption = FuelConsumption;
		}
		
		public double getDrivenDistance(){
		return DrivenDistance;
			
		}
		public void getCurrentFuelAmount() {
			float fuel = fuel - getFuelConsumption();
			setCurrentFuelAmount(fuel);
			System.out.println("The car contains an amount of " + fuel + " liters of " + this.getFuelType());
		}
		public void setAverageFuelConsumption(float averageFuelConsumption) {
			AverageFuelConsumption = averageFuelConsumption;
		}
		public void setAverageFuelConsumption(float averageFuelConsumption) {
			AverageFuelConsumption = averageFuelConsumption;
		}
		public Car(float CurrentFuelAmount, float averageFuelConsumption) {
	 		this.CurrentFuelAmount = CurrentFuelAmount;
	 		this.averageFuelConsumption = CurrentFuelAmount;
		}
		public float getAverageFuelConsumption() {
			float AverageFuelConsumption = (float) (this.getCurrentFuelAmount() / this.getDrivenDistance()*100);
	        return AverageFuelConsumption;
	 	}
		@Override
		public void start(){
		System.out.println(	"On" + getCurrentFuelAmount() + " liters of " + this.getFuelType());
	     this.setCurrentConsumption();
		//CurrentFuelAmount = CurrentFuelAmount;
		CurrentConsumption = 0;
		}
		@Override
		public abstract void drive(float DistanceDriven);
		
	    @Override
	    public void stop(){
		this.getCurrentFuelAmount();
		 }
	
		}
		

