package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a new bank account
		//This instantiation of object
	
	BankAccount acc1 = new BankAccount();
	acc1.setName("Joshi");
	System.out.println (acc1.getName());
	acc1.setSsn("345");
	System.out.println(acc1.getSsn());
	acc1.setRate();
	acc1.increaseRate();
	LoanAccount  L1 = new LoanAccount();
	L1.increaseRate();
	L1.setRate();
	/*
	acc1.deposit(1000);
	acc1.deposit(5000);
	acc1.withdraw(2000);
	CDaccount cd1 = new CDaccount();
	System.out.println(cd1.toString());
	*/
		
	/*
	System.out.println (acc1.routingNumber);
	BankAccount acc2 = new BankAccount("Checking account");
	System.out.println (acc2.routingNumber);
	BankAccount acc3 = new BankAccount("Checking account", 500);
	System.out.println (acc3.routingNumber);
	*/
/* acc3.checkbalance();
	acc1.name="Joshi";
	acc1.balance=500;
	System.out.println(acc1.toString());
	//demo for inheritance
	CDaccount cd1 = new CDaccount();
	cd1.name="G3";
	cd1.balance=200;
	System.out.println(cd1.toString());
	cd1.compound(); */
}
}
