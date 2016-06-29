class TestInstructor{
	public static void printTeachingDetails(Instructor i){
		System.out.println("Office Hours: "+i.getOfficeHours());
		System.out.println(i.getTeachingCourses());
	}
	public static void main(String[] args){
		Course[] c=new Course[1];
		Course[] e=new Course[1];
		c[0]=new Course(3302,"Historiography",20);
		e[0]=new Course(4309,"The Middle East after 1945",20);
		Faculty f=new Faculty("Chris",10000,"50 Hours",e);
		ResearchAssistant r=new ResearchAssistant("James",4.5,005,"The Sykes-Picot Agreement","30 Hours",c);
		printTeachingDetails(r);
		printTeachingDetails(f);
	}
}