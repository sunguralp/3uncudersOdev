
public class StudentManager {
	

	public void infoStudent(Student student) {
		System.out.println(student.takenCourse + " -> Kurs Alındı");
		System.out.println(student.creditCard + " -> Kart bilgisi kaydedildi");
		
	}
	
	
	public void studentInfo(Student[] students) {
  	  for(Student student : students) {
  		  infoStudent(student);
  		  
  	  }
	}

}
