package entities;

public class AbsIndividual extends TaxPayer {
	private Double healthExpenditures;

	public AbsIndividual() {
		super();
	}

	public AbsIndividual(String name, Double annualncome, Double healthExpenditures) {
		super(name, annualncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		return (getAnnualncome() * 0.25) - (healthExpenditures * 0.50);
	}

}
