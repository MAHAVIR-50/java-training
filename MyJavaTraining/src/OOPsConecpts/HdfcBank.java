package OOPsConecpts;

public class HdfcBank implements ReserveBank{

	public static void main(String[] args) {
		

	}

	@Override
	public void deposit(int money) {
		System.out.println("Hdfc Deposit " + money);
		
	}

	@Override
	public void withdraw(int money) {
		System.out.println("Hdfc withdrawal " +money);
		
	}

	@Override
	public void ATM(int money) {
		
		System.out.println("Hdfc ATM " +money);
	}

}
