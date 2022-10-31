package prob2A;

public class GradeReport {
	private Student student;
	
	public GradeReport(Student student)
	{
		this.student = student;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	} 
	
	
//	public String toString() {
//		return student.getName() +" obtain grade.";
//	}
}
