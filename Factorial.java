public class Factorial{
	public static long factorial(int n) {
    if(n == 0)
	return 1L;
    else 
       return n*factorial(n-1);
 }
 	public static void main(String[] args){
     long answer = factorial(5);
     System.out.println(answer);
 }
}