package Basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// Define variable career
		String career;
		System.out.println("Program is starting");
		career="Software Developer";
		System.out.println("career is:" + career);
		//define more variables
		int hoursPerWeek=40;
		int weeksPerYear=50;
		double rate = 42.50;
		double salary = hoursPerWeek * weeksPerYear * rate ;
		System.out.println ("Salary as a " + career + "at the rate of " + rate + "per year is" + salary);
	}

}
