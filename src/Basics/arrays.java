package Basics;

public class arrays {
	public static void main (String args[]) {
		String [] cities = {"Bangalore","Hubli","Mysore"};
		System.out.println("first element is " + cities[0]);
		String[] countries = new String[4];
		countries[0]="India";
		countries[1]="USA";
		countries[2]="Canada";
		countries[3]="Australia";
		System.out.println("first country is " + countries[0]);
		int a=0;
			do {
				System.out.println("Country is : " + countries[a]);
				a=a+1;
			} while (a < 4);
		int n=0; 
			while (n <=3) {
				System.out.println("Country as per while : " + countries[n]);
				n++;
			}
		System.out.println("\n For loop op is");
		for (int x=0; x<=3; x++) {
			System.out.println("Country at " + x + " is : " + countries[x]);
		}
	}
}
