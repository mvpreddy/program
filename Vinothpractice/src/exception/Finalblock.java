package exception;

public class Finalblock {

	public static void main(String[] args) {
		try{
			
	
			int i=10/0;
			System.out.println(i);
		}  
		  catch(ArithmeticException e)
		{System.out.println(e);}
		finally{System.out.println("remaining");}
		System.out.println("remain code is executed");
	}

}