
public class InstructorManager {
	
	public void infoInstructor(Instructor instructor) {
		System.out.println(instructor.about + " -> Bilgiler kaydedildi");
		System.out.println(instructor.givenCourse + "-> Kurslar baþarýyla yüklendi");
	}
	
	public void infoInstruct(Instructor[] instructors) {
  	  for(Instructor instructor : instructors) {
  		  infoInstructor(instructor);
  		 
  	  }
	}
}
