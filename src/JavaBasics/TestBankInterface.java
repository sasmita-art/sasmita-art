package JavaBasics;

public class TestBankInterface {

	public static void main(String[] args) {
	HSBCBankClass hsbc= new  HSBCBankClass();
	hsbc.credit();
	hsbc.debit();
	hsbc.transfermoney();
	hsbc.educationalLoan();
	hsbc.homeLoan();
	hsbc.atmCard();
	hsbc.trading();
	
	
	 USBankInterface us= new HSBCBankClass();// Dynamic Polymerphism
	 us.credit();
	 us.debit();
	 us.transfermoney();
	 //How to call the interface variable:  By interface name
	 
	 System.out.println(USBankInterface.min_bal);
	 
	
	 
	

	}

}
