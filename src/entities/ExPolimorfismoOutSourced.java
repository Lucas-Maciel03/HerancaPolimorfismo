package entities;

public class ExPolimorfismoOutSourced extends ExPolimorfismoEmp {
	private Double additionalCharge;
	
	public ExPolimorfismoOutSourced() {
		super();
	}

	public ExPolimorfismoOutSourced(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
