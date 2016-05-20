import java.io.*;
public class GradeArray{ 
   public static double getAverage(double[] a,int count){
		double sum=0;
		if(count==0)
		throw new IllegalArgumentException("Zero count");
		else
			for(int i=0;i<count;i++){
			sum+=a[i];
		}
		return sum/count; 
   }
	public static void printAboveAverage(double[] a,int count,double average){
		for(int i=0;i<count;i++){
			if(a[i]>average)
				System.out.println(a[i]);
		}
	}
   public static void main(String[] args)throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		double[] grade= new double[100];
		int gradecount=0;
		System.out.println("Enter the grade");
		double value=Double.parseDouble(b.readLine());
		while(value>=0 && gradecount<100){
			grade[gradecount]=value;
			gradecount++;
			System.out.println("Enter the next grade");
			value=Double.parseDouble(b.readLine());	
		}
		double Average = getAverage(grade,gradecount);
		System.out.println("Average= " + Average);
		System.out.println("Grades above average are: ");
		printAboveAverage(grade, gradecount, Average);
	}
}