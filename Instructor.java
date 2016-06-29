interface Instructor{
	public abstract String getOfficeHours();
	public abstract Course[] getTeachingCourses();
}
class Course{
	int courseCode;
	String title;
	int creditHours;
	public Course(int courseCode,String title,int creditHours){
		this.courseCode=courseCode;
		this.title=title;
		this.creditHours=creditHours;
	}
	public int getCourseCode(){
		return courseCode;
	}
	public String getTitle(){
		return title;
	}
	public void setCreditHours(int n){
		creditHours=n;
	}
	public String toString(){
		return "Course Code: "+courseCode+"\n Course Title: "+title+"\n Course Hours: "+creditHours;
	}
}
class Faculty extends MonthlyEmployee implements Instructor{
	String officeHours;
	Course[] teachingcourses;
	public Faculty(String name,double Salary,String officeHours, Course[] teachingcourses){
		super(name,Salary);
		this.officeHours=officeHours;
		this.teachingcourses=teachingcourses;
	}
	public String getOfficeHours(){
		return officeHours;
	}
	public Course[] getTeachingCourses(){
		return teachingcourses;
	}
}
class Student{
	private String name;
	private int id;
	private double gpa;
	public Student(int id, String name, double gpa){
		this.id=id;
		this.name=name;
		this.gpa=gpa;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public double getGPA(){
		return gpa;
	}
	public String toString(){
		return "Name: "+name+"\n ID: "+id+"\n GPA: "+gpa;
	}
	public void setGPA(double newGPA){
		gpa=newGPA;
	}
}

class GraduateStudent extends Student{
	private String thesisTitle;
	public GraduateStudent(int id, String name, double gpa, String thesisTitle){
		super(id,name,gpa);
		this.thesisTitle=thesisTitle;
	}
	public String toString(){
		return super.toString()+"\n Thesis Title: "+thesisTitle;
	}
}
class ResearchAssistant extends GraduateStudent implements Instructor{
	String officeHours;
	Course[] teachingcourses;
	public ResearchAssistant(String name, double gpa,int id,String thesisTitle,String officeHours, Course[] teachingcourses){
		super(id,name,gpa,thesisTitle);
		this.officeHours=officeHours;
		this.teachingcourses=teachingcourses;
	}
	public String getOfficeHours(){
		return officeHours;
	}
	public Course[] getTeachingCourses(){
		return teachingcourses;
}
}