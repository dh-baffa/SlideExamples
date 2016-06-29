abstract class Employee{
	String name;
	double Salary;
	public Employee(String name,double Salary){
		this.name=name;
		this.Salary=Salary;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return Salary;
	}
	public String printPay(){
		return name+"\n"+Salary;
	}
}