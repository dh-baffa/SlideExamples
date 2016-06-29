public abstract class Shape{
	public abstract double area();
	public abstract double perimeter();
	public String name(){
		return getClass().getName();
	}
	public String toSring(){
		return name()+"\nperimeter: "+perimeter()+"\nArea: "+area();
	}
}