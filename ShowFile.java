import java.io.*;
public class ShowFile{
  public static void main(String[] args)throws IOException{
	int input;
	BufferedReader  fin = null;
	try{
	    fin = new BufferedReader(new FileReader("myinput.txt"));
	}catch(FileNotFoundException e){
	   System.out.println("Error - File myinput.txt not found");
	   System.exit(1);
	}
	while(( input = fin.read()) != -1)
	   System.out.print((char) input);
	fin.close();
  }
} 
