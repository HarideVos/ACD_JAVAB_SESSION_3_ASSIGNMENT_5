package threepointfive;

class Saving extends Account{
	private double rateOfInt;
	
	public Saving(int accNo, String accName, String accBal, double rateOfInt) {
		super(accNo, accName, accBal);
		this.rateOfInt = rateOfInt;
	}

	public double getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(double rateOfInt) {
		this.rateOfInt = rateOfInt;
	}
	
	@Override
	public String toString() {
		return "Savings Account:\n"
				+ "Interest rate: " + rateOfInt
				+ "\nAccount Number: " + getAccNo() 
				+ "\nAccount Name: " + getAccName()
				+ "\nAccount Balance: " + getAccBal();
	}
}

