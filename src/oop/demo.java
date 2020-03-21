package oop;
class person {
	String name;
	String phone;
	String email;
	
	void walk () {
		System.out.println(name + " is walking");
	}
	void sleep () {
		System.out.println(name + " is sleeping");
	}
	void call (){
		System.out.println("Call on phone" + phone );
	}
}


public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person person1 = new person();
		person1.name="Joshi";
		person1.walk();
		person person2= new person();
		person2.name="Chandru";
		person2.walk();
	}

}
