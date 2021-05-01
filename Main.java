
public class Main {

	public static void main(String[] args) {
		


		Student student = new Student();
		student.id = 0;
		student.takenCourse = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA-REACT)";
		student.creditCard = "7894-5425-4345-8752";
		student.firstName = "Hakan Deniz ";
		student.lastName = "Sun�ur";
		student.email = "hakanden�zsungur@gmail.com";
		student.city = "Hatay";
		student.setZipCode("31313131");
		
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiro�";
		instructor.email = "engindemirog@gmail.com";
		instructor.city = "Ankara";
		instructor.setZipCode("06060606");
		instructor.about = "Dan��manl�k veya e�itim verdi�i kurum say�s� son 10 y�lda 300'� ge�ti.";
		instructor.certificate = "PMP, MCT";
		instructor.givenCourse = "Java, C#, Temel Programlama";
		instructor.studentCount = "30.000";
		
		StudentManager studentManager = new StudentManager();
		Student[] students = {student};
		studentManager.studentInfo(students);
		
		UserManager userManager = new UserManager();
		User[] users = {student,instructor};
		userManager.infoUser(users);
		
		InstructorManager instructManager = new InstructorManager();
		Instructor[] instructors = {instructor};
		instructManager.infoInstruct(instructors);
	}

}
