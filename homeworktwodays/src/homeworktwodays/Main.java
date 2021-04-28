package homeworktwodays;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�", 99);
        
        Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin Demiro�", 25);
        
        Course course3 = new Course(3, "Programlamaya Giri� i�in Temel Kurs", "Engin Demiro�", 100);
	
        Course[] courses = { course1,course2,course3};
    
    	System.out.println(courses.length + " adet Kurslar Listelendi");
	
	for (Course course : courses) {
		System.out.println("Kurs ad�: " +course.courseName + " E�itmeni: " + course.instructor);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
	}
	
	CourseManager courseManager = new CourseManager();
	
	courseManager.addToCourses(course1);
	courseManager.deleteToCourses(course1);
	courseManager.progress(course1);
	System.out.println("-----------------------------------------------------------------");
	courseManager.addToCourses(course2);
	courseManager.deleteToCourses(course2);
	courseManager.progress(course2);
	System.out.println("-----------------------------------------------------------------");
	courseManager.addToCourses(course3);
	courseManager.deleteToCourses(course3);
	courseManager.progress(course3);
	System.out.println("-----------------------------------------------------------------");
	}	
}	
