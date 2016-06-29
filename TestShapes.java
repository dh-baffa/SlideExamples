public class TestShapes{
	public static String printPay(Shape l){
		return l.toSring();
	}
	public static void main(String[] args){
		Shape[] shape=new Shape[3];
		shape[0]=new Rectangle(5,10);
		shape[1]=new Square(10);
		shape[2]=new Circle(15);
		
		for(int w=0;w<shape.length;w++)
			System.out.println(printPay(shape[w]));	
	}
}
