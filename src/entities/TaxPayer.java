package entities;

public abstract class TaxPayer {
	private String name;
	private Double annualncome;
	
	public TaxPayer() {
		super();
	}

	public TaxPayer(String name, Double annualncome) {
		super();
		this.name = name;
		this.annualncome = annualncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualncome() {
		return annualncome;
	}

	public void setAnnualncome(Double annualncome) {
		this.annualncome = annualncome;
	}
	
	public abstract double tax();
}
