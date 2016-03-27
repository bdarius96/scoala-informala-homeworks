package Car;

public class Up extends VW {
	
	private int Seats;

	public Up(int FuelInTank,String chassisNumber) {
		super(chassisNumber, FuelInTank);

	}

	public Up(String chassisNumber, int FuelInTank, int Seats) {
		super(chassisNumber, FuelInTank);
		this.Seats = Seats;
	}

	public int getSeats() {
		return Seats;
	}

	public void setSeats(int Seats) {
		this.Seats = Seats;
	}
