import java.io.*;
       public class TestException{
         public static void main(String[] args)throws IOException{
           BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
           int number = 0;
           boolean  done = false;
           do{
              try{ System.out.println("Enter an integer: ");
                number = Integer.parseInt(stdin.readLine().trim());
	             done = true;
              }
              catch(NumberFormatException e){
                System.out.println("Error - Invalid input!");
              }
           }while(! done);
           System.out.println("The number entered is " + number);
        }
    }
