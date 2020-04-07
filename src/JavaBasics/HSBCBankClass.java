package JavaBasics;

public class HSBCBankClass implements USBankInterface,UKBankInterface {
	
		@Override // override from usbank interface
		public void credit() {
			System.out.println(" HSBC credit method");
		}
		public void debit() {
			System.out.println(" HSBC Debit method");
		}
		
		public void transfermoney() {
			System.out.println(" HSBC transfer money method");
		}
		
		// own method of HSBC Bank
		public void educationalLoan()	{
			
			System.out.println(" HSBS educatioanl load");
			}
		
		public void homeLoan() {
			System.out.println("HSBC Home Load");
			
		}
		
		//UKBank methods
		public void atmCard() {
			System.out.println("Hsbc Bank atmcard method");
		}
		public void trading() {
			System.out.println("hsbc bank trading method");
		}
		}


