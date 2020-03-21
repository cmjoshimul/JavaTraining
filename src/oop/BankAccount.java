package oop;

public class BankAccount implements Irate {
	//Define variables - instance variables
	String accountNumber;
	//Static variable belongs to class and not to objects
	//static variables
	private static final String routingNumber = "12345";
	
	String name;
	private String ssn;
	String accountType; 
	double balance;
	//constructor methods 
	//define, initialise properties of an object
	//implicitly called on instantiation
	//Method name is same as class name
	//No return type for constructor 
	BankAccount () {
		System.out.println ("New Account Created");
	
	}
	//overloading - call same method with different arguments
	BankAccount (String AccountType) {
		System.out.println ("Account Type is: " + AccountType);
	}
	BankAccount (String AccountType, double initDeposit) {
		System.out.println ("Account Type is: " + AccountType);
		System.out.println ("Deposit is :" + initDeposit);
		//local variable
		String Msg="";
		if (initDeposit < 1000) {
			 Msg="Initial Deposit must be more than 1000";
		} else {
			 Msg = "Thanks for the Deposit of " + initDeposit;
		}
		System.out.println (Msg);
		balance=balance+initDeposit;
	}	
	//define methods
	void deposit(double amount) {
		balance = balance +amount;
		showActivity("Deposit");
	}
	void withdraw (double amount) {
		balance = balance - amount;
		showActivity("Withdrawal");
	}
	
	void checkbalance () {
		System.out.println("Balance is : " + balance);
	}
	void checkstatus () {
		
	}
	@Override
	public String toString () {
		return (name + " " + balance + routingNumber);
	}
	private void showActivity (String activity) {
		System.out.println ("Recent activity is:" + activity);
		System.out.println ("Your new balance is:" + balance);
	}
	public void setName(String pName){
		this.name=pName;
	}
	public String getName() {
		return this.name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	//Interface methods
	public void setRate () {
		System.out.println("Setting Rate");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate");
		
	}
}
