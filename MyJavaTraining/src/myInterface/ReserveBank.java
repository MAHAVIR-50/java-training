package myInterface;

public interface ReserveBank {
	public void deposite(int money);
	public void withdrawByBranch(int money);
	public void withdrawByATM(int money);
	public void openAccount(int money);

}
