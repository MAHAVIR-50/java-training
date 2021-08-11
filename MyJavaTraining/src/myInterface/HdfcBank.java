package myInterface;

public class HdfcBank implements ReserveBank{

	public static void main(String[] args) {
		ReserveBank hdfc = new HdfcBank();
		
		System.out.println("HDFC BANK");
		hdfc.deposite(5000);
		hdfc.withdrawByBranch(3000);
		hdfc.withdrawByATM(2000);
		hdfc.openAccount(5000);
		

	}

	@Override
	public void deposite(int money) {
		
		System.out.println("Deposite money in account");
	}

	@Override
	public void withdrawByBranch(int money) {
		System.out.println("Withdraw money from branch");
		
	}

	@Override
	public void withdrawByATM(int money) {
		System.out.println("Withdraw money by ATM");
		
	}

	@Override
	public void openAccount(int money) {
		System.out.println("Open an account");
		
	}

}
