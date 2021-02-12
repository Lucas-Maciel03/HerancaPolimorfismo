package entities;

public class AbsCompany extends TaxPayer{
	private int numberOfEmployees;
	
	public AbsCompany() {
		super();
	}

	public AbsCompany(String name, Double annualncome, int numberOfEmployees) {
		super(name, annualncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if(numberOfEmployees>10) {
			return getAnnualncome() * 0.14;
		}
		else {
			return getAnnualncome() * 0.16;
		}
	}
	
}
