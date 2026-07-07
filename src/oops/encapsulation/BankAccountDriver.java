package oops.encapsulation;

public class BankAccountDriver {
	public static void main(String[]args)
	{
		BankAccount account=new BankAccount();
		account.setAccountNumber(101);
		account.setAccountHolder("Vamshi");
		account.setBalance(3459.0);
		System.out.println("Account Number : " + account.getAccountNumber());
		System.out.println("Account Holder : " +account.getAccountHolder());
		System.out.println("Account Balance : " +account.getBalance());
	}

}
