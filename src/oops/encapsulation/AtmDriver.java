package oops.encapsulation;

public class AtmDriver {
	public static void main(String[]args)
	{
		Atm a1=new Atm();
		a1.setBalance(20000.0);
		System.out.println("Current Balance : "+ a1.getBalance());
		System.out.println("-------------------------");
		a1.deposit(40000.0);
		System.out.println("Balance : "+a1.getBalance());
		System.out.println("-------------------------");
		a1.withdraw(30000.0);
		System.out.println("Balance : "+a1.getBalance());
		System.out.println("-------------------------");
	}

}
