package Week2.Day4;

public class Amazon extends CanaraBank {

	public void cashOnDelivery() {
		System.out.println("Cash on Delivery");

			
	}

	
	public void upiPayments()  {
		System.out.println("UPI Payments");

		
	}

	
	public void cardPayments() {
		System.out.println("Card Payments");

		
	}


	public void internetBanking() {
		System.out.println("Internet Banking");

		
	}


	public void recordPaymentDetails()  {
		System.out.println("Record Payment Details");

		
	}

	
	public static void main(String[] args) {
		
		Amazon ama = new Amazon();
		ama.cashOnDelivery();
		ama.cardPayments();
		ama.upiPayments();
		ama.internetBanking();
		ama.recordPaymentDetails();
		
	}
}
