import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Calc{
	public  double add(double x, double y){
		return x+y;
	}
	public  double subtract(double x, double y){
		return x-y;
	}
	public  double multiply(double x, double y){
		return x*y;
	}
	public  double divide(double x, double y){
		return x/y;
	}
	public  double areaofcircle(double r){
		return Math.PI*Math.pow(r,2);
	}
	public  double circumferenceofcircle(double r){
		return 2*Math.PI*Math.pow(r,2);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader c=new BufferedReader( new InputStreamReader(System.in));
		Calc calculator= new Calc();
		System.out.println("Enter two numbers to add");
		double x= Double.parseDouble(c.readLine());
		double y= Double.parseDouble(c.readLine());
		System.out.println(calculator.add(x,y));

		System.out.println("Enter two numbers to subtract");
		x= Double.parseDouble(c.readLine());
		y= Double.parseDouble(c.readLine());
		System.out.println(calculator.subtract(x,y));
	
		System.out.println("Enter two numbers to multiply");
		x= Double.parseDouble(c.readLine());
		y= Double.parseDouble(c.readLine());
		System.out.println(calculator.multiply(x,y));

		System.out.println("Enter two numbers to divide");
		x= Double.parseDouble(c.readLine());
		y= Double.parseDouble(c.readLine());
		System.out.println(calculator.divide(x,y));

		System.out.println("Enter the value of r");
		double r= Double.parseDouble(c.readLine());
		System.out.println(calculator.areaofcircle(r));

		System.out.println("Enter the value of r");
		r= Double.parseDouble(c.readLine());
		System.out.println(calculator.circumferenceofcircle(r));

		/*System.out.println("Welcome to my new calculator");
		System.out.println("Select operation");
		System.out.println("\t 1 for addition");
		System.out.println("\t 2 for subtraction");
		System.out.println("\t 3 for multiplication");
		System.out.println("\t 4 for division");
		System.out.println("\t 5 for area of a circle");
		System.out.println("\t 6 for circumference of a circle");*/
	}
}
