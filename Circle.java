class Circle{
  private static int numberOfCircles;
  private double radius;
	public Circle(double theRadius){
    radius = theRadius;
    numberOfCircles++;
  }
	public void finalize(){
   numberOfCircles--;
  }
	public static int getCount(){
    return numberOfCircles;
  }		
}
