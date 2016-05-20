public class StudentTest{
  static int i = 10;
  static void mixUp(int i, String str, Student one, Student two){
  	i++;
  	str =  "Second Message";
  	one = two;
  	one.setGPA(3.4);  
    one.setName("Ali");
   }
  public static void main(String[] args) {
    String str = "First Message";
    Student s1 =new Student(123, "Khalid" ,1.3);
    Student s2=new Student(456, "Amr", 3.1);
    System.out.println("i = " + i);
    System.out.println("str = " + str);
    System.out.println("Student1: " + s1);
    System.out.println("Student2: " + s2);
    mixUp(i, str, s1, s2);
    System.out.println("i = " + i);
    System.out.println("str = " + str);
    System.out.println("Student1: " + s1);
    System.out.println("Student2: " + s2);
  }
}
