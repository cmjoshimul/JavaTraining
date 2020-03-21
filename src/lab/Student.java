package lab;

public class Student {
		//declare instance variables
	    private static int id=2020;
		private static String StudentId;
		String name ;
		String SSN;
		String emailId;
		String userId;
		String[] courseName = {"Java", "C++", "Python", "DotNet"};
		Double[] courseFee = {1000.0,2000.0,3000.0,4000.0};
		String phone;
		String city;
		String state;
		
		
		Student (String pName, String SSN) {
			 emailId= pName + "@Joshglobal.com";
			 int random= (int) (Math.random()* 10000);
			 StudentId = id + ""+ random + SSN.substring(6);
			 System.out.println ("StudentId is: " + StudentId); 
			 
					 
		}
		public void enroll (String pcourse) {
			System.out.println ("Enrolled to course" + pcourse);
		}
		public void pay (double ppay) {
			if (ppay > 1000) {
				System.out.println ("Fees paid");
			} else {
				System.out.println ("pay correct fees");
			}
		}
		public void checkBalance () {
			
		}
		public void showCourse () {
			for (int i=0; i<courseName.length; i++)
			System.out.println ("courses available are:" + courseName[i]);
			
		}
		public void setCity(String pcity){
			this.city=pcity;
		}
		public String getCity() {
			return this.city;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		}

