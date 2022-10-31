package prob2A;

public class Student {
	private GradeReport gradeReport; 
	private String name;
	
	public Student(String name) 
	{
		this.name = name;
		gradeReport  = new GradeReport(this); 
	}
	
	public void setGradeReport(GradeReport gradeReport) {
		this.gradeReport = gradeReport;
	}
	
	public GradeReport getGradeReport() {
		return gradeReport;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
