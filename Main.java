
public class Main {

	public static void main(String[] args) {
		


		Student student = new Student();
		student.id = 0;
		student.takenCourse = "Yazılım Geliştirici Yetiştirme Kampı (JAVA-REACT)";
		student.creditCard = "7894-5425-4345-8752";
		student.firstName = "Hakan Deniz ";
		student.lastName = "Sunğur";
		student.email = "hakandenızsungur@gmail.com";
		student.city = "Hatay";
		student.setZipCode("31313131");
		
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiroğ";
		instructor.email = "engindemirog@gmail.com";
		instructor.city = "Ankara";
		instructor.setZipCode("06060606");
		instructor.about = "Danışmanlık veya eğitim verdiği kurum sayısı son 10 yılda 300'ü geçti.";
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
