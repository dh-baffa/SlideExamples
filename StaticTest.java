public class StaticTest{
 public static void main(String[] args){
   System.out.println(Circle.getCount());
   Circle circle1 = new Circle(4.0);
   Circle circle2 = new Circle(2.5);
   System.out.println(circle2.getCount());
   circle1=null;
   System.gc();
   System.out.println(Circle.getCount());
 }
}
