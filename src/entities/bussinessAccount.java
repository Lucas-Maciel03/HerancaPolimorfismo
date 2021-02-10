package entities;

public class bussinessAccount extends Account {
	private Double loanLimit;
	
	public bussinessAccount() {
		super();
	}

	public bussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.00;
		}
	}
}
