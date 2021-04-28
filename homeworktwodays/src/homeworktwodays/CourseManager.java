package homeworktwodays;

public class CourseManager {
	
	public void addToCourses(Course course) {
	       System.out.println(course.courseName + " Kursu listenize eklendi.");
	       System.out.println("Eðitmeni " + course.instructor);
	    }
	 
	public void deleteToCourses(Course course) {
		System.out.println(course.courseName + " Kursu listenizden çýkarýldý." );
	}
	 public void progress(Course course) {
	       System.out.println(course.courseName + " kursu % " + course.courseProgress + " tamamlandý.");    	
	    }

}
