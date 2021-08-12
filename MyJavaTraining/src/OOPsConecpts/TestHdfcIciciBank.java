package OOPsConecpts;

public class TestHdfcIciciBank {

	public static void main(String[] args) {
		
		ReserveBank hdfcbank = new HdfcBank();
		hdfcbank.deposit(5000);
		hdfcbank.withdraw(2000);
		hdfcbank.ATM(2000);
		
		System.out.println("--------------------------");
		
		ReserveBank icicibank = new IciciBank();
		icicibank.deposit(8000);
		icicibank.withdraw(3000);
		icicibank.ATM(3000);
	}

}
