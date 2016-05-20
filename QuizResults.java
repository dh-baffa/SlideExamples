import java.io.*;
import java.util.StringTokenizer;
public class QuizResults{
  public static void main(String[] args)throws IOException{
    BufferedReader  inputStream = new BufferedReader(new FileReader("grades.txt"));
	StringTokenizer tokenizer; 
	String inputLine,  id; int  count; double  sum;
	
	System.out.println("ID#   Number of Quizzes	  Average\n");    
	
	while((inputLine = inputStream.readLine()) != null){
	  tokenizer = new StringTokenizer(inputLine);
	  id = tokenizer.nextToken();
	  count = tokenizer.countTokens();
	  sum = 0.0;
	  while(tokenizer.hasMoreTokens())
		sum += Double.parseDouble(tokenizer.nextToken( ));
	  System.out.println(id + "  " + count + " " + sum / count);
	}
   }
}