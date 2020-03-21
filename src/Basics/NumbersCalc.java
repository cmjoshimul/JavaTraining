package Basics;

public class NumbersCalc {
	public static void main (String args []) {
		System.out.println("Program is starting");
		printName();
		int numA=10;
		int numB=20;
		int productC;
		addNumbers(numA, numB);
		productC = multiplyNumbers(numA, numB); 
		System.out.println("product of numbers " + numA + " and " + numB + " is " + productC);
	}

	static void printName(){
		System.out.println("My name is Joshi");
	}
	
	static void addNumbers (int numberA, int numberB){
		int numberC = numberA+numberB;
		System.out.println("Sum of numbers " + numberA + " and " + numberB + " is " + numberC);
	}
	
	static int multiplyNumbers(int valueA, int valueB){
		int valueC=valueA*valueB;
		return valueC;
	}
	
}
