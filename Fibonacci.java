public class Fibonacci{
	public static long fibonacci(int n) {
  	 if (n < 2) 
     	return 1L;
 	 else 
    	return fibonacci(n-1) + fibonacci(n-2);
  }

   public static void main(String[] args){
      long answer = fibonacci(4);
      System.out.println(answer);
     }
}
