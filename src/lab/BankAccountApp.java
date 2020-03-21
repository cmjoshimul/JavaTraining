package lab;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("123456",1000);
		acc1.setName("Joshi");
		acc1.makeDeposit(500);
		acc1.payBill(200);
		acc1.accrue();
		System.out.println (acc1.toString());
	}
}

class BankAccount implements Interest{
	//properties of bank account
	private static int id=1001; //internal id
	private String accountNumber; //id + 2 digt random nbr + first 3 digits of ssn
	private static final String routingNumber = "005457";
	private String name;
	private String Ssn;
	private double balance;
	//constructor
	public BankAccount(String pSsn, double initDeposit) {
		balance=initDeposit;
		id++;
		System.out.println (id);
		this.Ssn=pSsn;
		setAccountNumber();
	}
	private void setAccountNumber() {
		int random= (int) (Math.random() * 100);
		System.out.println(random);
		System.out.println(Ssn);
		accountNumber=id+ ""+ random+ Ssn.substring(0, 2);
		System.out.println("Your account number is: " + accountNumber);
		showBalance ();
	}
	public void setName (String pName) {
		this.name=pName;
	}
	public String getName () {
		return this.name;
	}
	public void payBill(double amount) {
		System.out.println("Paying bill of $"+amount);
		balance=balance-amount;
		showBalance();
	}
	public void makeDeposit (double amount) {
		System.out.println("Making deposit of $"+amount);
		balance=balance+amount;
		showBalance();
	}
	public void showBalance () {
		System.out.println ("Balance is: $" + balance);
	}
	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance=balance*(1+rate/100);
		showBalance();
	}
	@Override 
	public String toString() {
		return "[name:" + name + "]\n[Account number:"+ accountNumber + "]\n[routing number: " 
	           + routingNumber + "]\n[Balance is:" + balance + "]" ;
	}
	
}
