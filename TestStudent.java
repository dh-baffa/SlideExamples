public class TestStudent{
  public static void main(String[] args){
   Student s=new Student(123,"Ahmed",3.2);
   Student x = new Student(123,"Ahmed",3.2);
   Student y = new Student(456, "Yusuf", 2.0);
   System.out.println(s.equals(x));
   System.out.println(s==x);
   System.out.println(x.equals(y));
} 
}
