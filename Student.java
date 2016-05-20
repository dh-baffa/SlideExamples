class Student{ 
	private int id;
	private String name;
	private double gpa; 
    public Student(int id, String name, double gpa){
     this.id = id;
     this.name = name; 
     this.gpa = gpa;
    }
	public boolean equals(Student student){
	return this.id == student.id ;
  }
  public double setGPA(double q){
    return gpa=q;
  }
  public String setName(String g){
    return name=g;
  }
}
