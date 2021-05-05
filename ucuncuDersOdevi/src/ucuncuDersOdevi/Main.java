package ucuncuDersOdevi;

public class Main {

	public static void main(String[] args) {
		
	Student student1 = new Student();
	student1.setId(1);
	student1.setFirstName("Gülsevim");
	student1.setLastName("Şener");
	student1.setCourse("Java");
	student1.setStudentNumber("12323");
	
	Instructor instructor1 = new Instructor();
	instructor1.setId(2);
	instructor1.setFirstName("Engin");
	instructor1.setLastName("Demiroğ");
	instructor1.setCourse("C++");
	instructor1.seteMail("demirog@csbb.dd.tr");
	
	
	UserManager userManager = new UserManager();
	userManager.add(student1);
	userManager.add(instructor1);
	
		
				
		
		
		

	}

}
