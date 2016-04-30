import java.io.*;
    class BankAccount{
	      private int accountNumber;
	      private double balance;
          public void deposit(double amount){
	         if(amount <= 0)
	            throw new IllegalArgumentException("Negative deposit");
	          else
	            balance += amount;
           }

        }
	public class BankAccountTest{
           public static void main(String[] args)throws IOException{
			BankAccount account= new BankAccount();
			 BufferedReader stdin=null;
	          boolean done = false;
	          do{
	             System.out.println("Enter amount to deposit:");
				 stdin=new BufferedReader(new InputStreamReader(System.in));
                 double amount = Double.parseDouble(stdin.readLine());
	              try{
	                account.deposit(amount);
		          done = true;
	               } 
             catch(IllegalArgumentException e){
				 System.out.println("You entered a negative amount");
				 }
	           }while(! done);
           }
       } 
