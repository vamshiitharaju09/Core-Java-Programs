package oops.encapsulation;

public class Atm {
	private double balance;

	public void setBalance(double balance)
	{
		if(balance>=0)
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

	//Deposit Method
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("Deposit Amount : " +amount);
		}
		else
		{
			System.out.println("Invalid Balance");
		}
	}
	//Withdraw
	public void withdraw(double amount)
	{
		if(amount<=0)
		{
			System.out.println("Invalid Withdraw Amount");
		}
		else if(amount>balance)
		{
			System.out.println("Insufficient Balance");
		}
		else {
			balance=balance-amount;
			System.out.println("Withdraw Amount : " +amount);
			
		}
	}

}
