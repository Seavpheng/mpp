package prob2A;

public class Main {
	public static void main(String[] args) {
		
		Student student = new Student("Khattiya"); 
		GradeReport grade = new GradeReport(student);
		 
		System.out.print(grade.toString());
		
	}
}
