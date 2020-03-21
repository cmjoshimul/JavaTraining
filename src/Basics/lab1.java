package Basics;

public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int factValue=fact(n);
		System.out.println("factorial of " + n + " is: "+ factValue);
		int sumValue=sum(n);
		System.out.println("Sum of " + n + " numbers is: "+ sumValue);
		int factRecValue=factRec(n);
		System.out.println("fact rec value for " + n + "  is: "+ factRecValue);
		int[] intArray = {100,100,200,200,300,500,600};
		System.out.println("min of the intArray is:"+minArray(intArray));
		System.out.println("max of the intArray is:"+maxArray(intArray));
		System.out.println("max of the intArray is:"+avgArray(intArray));
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
	static int minArray (int[] intArray ) {
		int min=intArray[0];
		for (int i=0; i<intArray.length; i++) {
			if (intArray[i] < min) {
				min=intArray[i];
			}
		}
		return min;
	}
	static int maxArray (int [] intArray) {
		int max=intArray[0];
		for (int i=0; i< intArray.length; i++){
			if (intArray[i] > max) {
				max=intArray[i];
			}
		}
		return max;
	}
	static int avgArray (int [] intArray) {
		int sum=0;
		for (int i=0; i<intArray.length; i++) {
			sum=sum+intArray[i];
		}
		return sum/intArray.length;
	}
}
