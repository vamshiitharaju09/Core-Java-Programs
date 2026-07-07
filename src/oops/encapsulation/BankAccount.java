package oops.encapsulation;

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public int getAccountNumber() 
	{
		return accountNumber;
	}
	
	public void setAccountHolder(String accountHolder)
	{
		this.accountHolder=accountHolder;
	}
	public String getAccountHolder()
	{
		return accountHolder;
	}
	
	public void setBalance(double balance)
	{
		if(balance>0)
		{
			this.balance=balance;
		}
		else {
			System.out.println("Invalid Balance");
		}
	}
	public double getBalance()
	{
		return balance;
	}

}
