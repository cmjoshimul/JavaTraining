package Basics;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term=8;
		int result;
		result=fibSeries(term);
		System.out.println("result is : " + result);
	}
	static int fibSeries(int termN){
		if (termN==0) {
			int retValue=0;
			return retValue;
		} else if (termN==1) {
			int retValue=1;
			return retValue;
		}
		return fibSeries (termN-1)+fibSeries(termN-2);
	}

}
