package Basics;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int factValue=fact(n);
		System.out.println("factorial of " + n + " is: "+ factValue);
		int sumValue=sum(n);
		System.out.println("Sum of " + n + " numbers is: "+ sumValue);

		int factRecValue=factRec(n);
		System.out.println("fact rec value for " + n + "  is: "+ factRecValue);
		
	}
	static int fact(int num){
		int product=1;
		for (int i=num; i>=1; i--) {
			product=product*i;
		};
		return product;
	}
	static int sum(int num) {
		int sum=0;
		for (int x=num; x>=1; x--) {
			sum=sum+x;
		}
		return sum;
	}
	static int factRec (int num) {
		
		if (num == 1) {
			return 1 ;
		} 
		return factRec(num-1)*num;
	}
}
