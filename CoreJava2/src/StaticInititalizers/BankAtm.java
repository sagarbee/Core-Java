package StaticInititalizers;

public class BankAtm {

	static double account;

	public static void main(String[] args) {
		
		deposite(50000);
		withdraw(500);
		atmWithdraw(50);
	}
	
	public static void deposite(double amount)
	{
		if(amount > 1000)
		{
			account += amount;
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
	
	public static void  withdraw(double amount)
	{
		//minimum balance should be 1000rs in bank
		if(amount>0 && account - amount >= 1000)
		{
			account -= amount;
			System.out.println("Amount Withdraw");
			printBalance();
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}
	public static void printBalance()
	{
		System.out.println("Your account balance is: "+ account);
	}
	
	
	public static void atmWithdraw(double amount)
	{
		if(amount % 100 == 0)
			withdraw(amount);
		else
			System.out.println("Enter amount multiple of 100");

	}
}
