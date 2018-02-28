package pkgCore;
import org.apache.poi.ss.formula.functions.Finance;
 
public class Loan {
	
	double carPrice;
	double downPay;
	int loanLength;
	double rateLoan;
	
	public Loan(double carPrice, double downPay, int loanLength, double rateLoan) {
		super();
		this.carPrice = carPrice;
		this.downPay = downPay;
		this.loanLength = loanLength;
		this.rateLoan = rateLoan;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public double getDownPay() {
		return downPay;
	}
	public void setDownPay(double downPay) {
		this.downPay = downPay;
	}
	public int getLoanLength() {
		return loanLength;
	}
	public void setLoanLength(int loanLength) {
		this.loanLength = loanLength;
	}
	public double getRateLoan() {
		return rateLoan;
	}
	public void setRateLoan(double rateLoan) {
		this.rateLoan = rateLoan;
	}

	
	
	public double carMonthPay() {
		return Finance.pmt(rateLoan/100, loanLength/12, carPrice, downPay);
	}
	
	public double interestSpent() {
		return (loanLength*carMonthPay()) + (carPrice-downPay);
	}

}
