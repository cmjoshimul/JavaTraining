package lab;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student("Joshi","1234567890");
		System.out.println ("email id is: " + s1.emailId);
		s1.showCourse();
		s1.enroll(s1.courseName[1]);
		s1.setCity("Bangalore");
		s1.setPhone("9886758982");
		System.out.println ("City is " + s1.getCity());
		System.out.println ("phone is: " + s1.getPhone());
		s1.pay(2000.0);
	}

}
