/*2. Write a class for Account containing data members ‘accountNumber’, ‘holderName’, ‘balance’ and add
constructors and necessary accessor/modifier functions for these data members. Now create two class
SavingsAccount and CurrentAccount extending from this class. SavingsAccount will have a member
variable ‘interestRate’ and member function ‘calculateYearlyInterest’. Write another class Manager that
contains a list Account. Also write a main() function to create an instance of Manager class. Add two
SavingsAccount and three CurrentAccount to Manager. Calculate interest of each SavingsAccount. Print
the details of all accounts.*/


class Account
{
	String accNumber;
	public String holderName;
	protected double balance;
	
	Account()
	{
		accNumber = null;
		holderName = null;
		balance = 0.0;
	}
	
	Account(String accNumber, String holderName, double balance)
	{
		this.accNumber = accNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	void display()
	{
		System.out.println("Account number = "+accNumber+"\nAccount holder name = "+holderName+"\nBalance = "+balance);
	}
}

 class SavingAcc extends Account
{
	double r;                                                    	//interest rate
    int n ;
	double T;
	double compoundInterest;
	
	SavingAcc()
	{
		r = 0.0;
		n = 0;
	
	}
	
	SavingAcc(String accNumber,String holderName, double balance, double r,int n,double T)
	{
		super(accNumber, holderName, balance);
		this.r = r;
		this.n = n;
		this.T = T;
	}
	
	double calculateYearlyInterest()
	{
		compoundInterest = balance * Math.pow((1+(r/n)),(n*T));
		return compoundInterest;
	}
	
	void display1()
	{
		System.out.println("Saving Account Yearly Interest = "+calculateYearlyInterest());
	}
}

class CurrentAcc extends Account
{
	double r;                                                    	//interest rate
	double T;
	double SimpleInterest;
	
	CurrentAcc()
	{
		r = 0.0;
		T = 0.0;
	}
	
	CurrentAcc(String accNumber,String holderName, double balance, double r,double T)
	{
		super(accNumber, holderName, balance);
		this.r = r;
		this.T = T;
	}
	
	double currentAccInterest()
	{
		SimpleInterest = balance * r * T/100;
		return SimpleInterest;
	}
	
	void display2()
	{
		System.out.println("Current Account Interest = "+currentAccInterest());
	}
	
}



 class Manager
{
	public static void main(String args[])
	{
	
		SavingAcc b1 = new SavingAcc("1234567890","Rajiv",2000.50,2.4,3, 2.2);
		b1.display();
		b1.display1();
		SavingAcc b2 = new SavingAcc("2234567890","Sayali",5000.40,3.0,4,3.0);
		b2.display();
		b2.display1();
		
	
		CurrentAcc c1 = new CurrentAcc("3234567890","Sahil",6005.50,5.2,2.3);
		c1.display();
		c1.display2();
		CurrentAcc c2 = new CurrentAcc("4234567890","Rajiv",7000.70,2.5,4.2);
		c2.display();
		c2.display2();
		CurrentAcc c3 = new CurrentAcc("5234567890","Rajiv",4000.30,3.0,6.0);
		c3.display();
		c3.display2();
	}
}




/*

Account number = 1234567890
Account holder name = Rajiv
Balance = 2000.5
Saving Account Yearly Interest = 96813.76045777938
Account number = 2234567890
Account holder name = Sayali
Balance = 5000.4
Saving Account Yearly Interest = 4125355.0362515687
Account number = 3234567890
Account holder name = Sahil
Balance = 6005.5
Current Account Interest = 718.2578
Account number = 4234567890
Account holder name = Rajiv
Balance = 7000.7
Current Account Interest = 718.2578
Account number = 5234567890
Account holder name = Rajiv
Balance = 4000.3
Current Account Interest = 720.0540000000001

*/