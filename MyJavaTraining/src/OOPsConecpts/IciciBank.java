package OOPsConecpts;

public class IciciBank implements ReserveBank{

	public static void main(String[] args) {
		

	}
  
	@Override
	public void deposit(int money) {
		System.out.println("Icici deposit "+money);
		
	}

	@Override
	public void withdraw(int money) {
		System.out.println("Icici withdrawl "+money);
		
	}

	@Override
	public void ATM(int money) {
		System.out.println("Icici ATM "+money);
		
	}

}
